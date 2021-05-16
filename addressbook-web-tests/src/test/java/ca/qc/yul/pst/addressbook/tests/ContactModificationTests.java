package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().returnToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification(0);
        app.getContactHelper()
                .fillContactForm(new ContactData("Ivanov", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before, after);
    }
}
