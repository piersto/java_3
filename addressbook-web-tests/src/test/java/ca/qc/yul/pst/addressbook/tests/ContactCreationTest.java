package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact = new ContactData(
                "Stoiko","Pierre", "[none]");
        app.getContactHelper().initContactCreation();
        app.getContactHelper().
                fillContactForm(contact, true);
        app.getContactHelper().submitContactCreation();
        app.navigationHelper.returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size() + 1, after.size());

        int max = 0;
        for (ContactData c : after) {
            if (c.getId() > max) {
                max = c.getId();
            }
        }
        contact.setId(max);
        before.add(contact);

        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
