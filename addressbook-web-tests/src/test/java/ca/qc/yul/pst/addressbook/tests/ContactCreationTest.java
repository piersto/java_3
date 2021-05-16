package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().returnToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().
                fillContactForm(new ContactData("Stoiko", "[none]" ), true);
        app.getContactHelper().submitContactCreation();
        app.navigationHelper.returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before + 1, after);
    }
}
