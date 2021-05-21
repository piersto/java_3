package ca.qc.yul.pst.addressbook.appmanager;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void deleteContacts() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("firstname"), contactData.getFirstName());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }else {
            Assert.assertFalse(elementPresent(By.name("new_group")));
        }
    }

    public void initContactCreation() {
        click(By.cssSelector("li.all a"));
    }

    public void initContactModification(int index) {
        wd.findElements(By.cssSelector("img[title='Edit']")).get(index).click();
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("#maintable > tbody > tr[name='entry']"));
        for (WebElement element : elements) {
            String id = element.findElement(By.cssSelector("input")).getAttribute("id");
            String lastName = element.findElement(By.cssSelector("tr > td:nth-child(2)")).getText();
            String firstName = element.findElement(By.cssSelector("tr > td:nth-child(3)")).getText();
            ContactData contact = new ContactData(id, lastName, firstName, null);
            contacts.add(contact);
        }
        return contacts;
    }

    public boolean isThereAContact() {
        return elementPresent(By.name("selected[]")) &&
                elementPresent(By.cssSelector("input[value='Add to']"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact, true);
        submitContactCreation();
    }
}
