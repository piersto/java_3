package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() throws Exception {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().
                fillContactForm(new ContactData("Stoiko", "[none]" ), true);
        app.getContactHelper().submitContactCreation();
    }
}
