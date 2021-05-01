package ca.qc.yul.pst.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        if (elementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && elementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void returnToHomePage() {
        if (elementPresent(By.cssSelector("span#search_count"))
        && wd.findElement(By.cssSelector("label strong")).getText().equals("Number of results: ")) {
            return;
        }
        click(By.linkText("home"));
    }
}
