package ca.qc.yul.pst.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends ApplicationManager {

    @BeforeMethod(alwaysRun = true)

    public void setUp() throws Exception {
        init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        stop();
    }

}
