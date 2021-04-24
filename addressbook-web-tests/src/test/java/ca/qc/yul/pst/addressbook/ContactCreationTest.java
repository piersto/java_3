package ca.qc.yul.pst.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() throws Exception {

        initContactCreation();
        fillContactForm(new ContactData("Stoiko"));
        submitContactCreation();
    }
}
