package ca.qc.yul.pst.addressbook.appmanager;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    protected final GroupHelper groupHelper = new GroupHelper();

    public void init() {
        groupHelper.wd = new ChromeDriver();
        groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper.wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) {
        groupHelper.wd.findElement(By.name("user")).clear();
        groupHelper.wd.findElement(By.name("user")).sendKeys(username);
        groupHelper.wd.findElement(By.name("pass")).click();
        groupHelper.wd.findElement(By.name("pass")).clear();
        groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
        groupHelper.wd.findElement(By.id("LoginForm")).click();
        groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void goToGroupPage() {
        groupHelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHelper.wd.quit();
    }

    public boolean isElementPresent(By by) {
        try {
            groupHelper.wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            groupHelper.wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void returnToHomePage() {
      groupHelper.wd.findElement(By.linkText("home")).click();
    }

    public void deleteContacts() {
      groupHelper.wd.findElement(By.xpath("//input[@value='Delete']")).click();
      groupHelper.wd.switchTo().alert().accept();
    }

    public void selectContact() {
      groupHelper.wd.findElement(By.name("selected[]")).click();
    }

    public void submitContactCreation() {
        groupHelper.wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
        groupHelper.wd.findElement(By.name("lastname")).click();
        groupHelper.wd.findElement(By.name("lastname")).clear();
        groupHelper.wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    }

    public void initContactCreation() {
        groupHelper.wd.findElement(By.cssSelector("li.all a")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
