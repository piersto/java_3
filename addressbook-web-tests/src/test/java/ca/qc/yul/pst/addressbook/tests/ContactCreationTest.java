package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().
                fillContactForm(new ContactData("Stoiko", "[none]" ), true);
        app.getContactHelper().submitContactCreation();
        app.navigationHelper.returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size() + 1, after.size());
    }
}
