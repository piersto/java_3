package ca.qc.yul.pst.addressbook.appmanager;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void deleteContacts() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("lastname"), contactData.getLastName());

        if (elementPresent(By.name("new_group"))){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
    }

    public void initContactCreation() {
        click(By.cssSelector("li.all a"));
    }

    public void initContactModification() {
        click(By.cssSelector("img[title='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
