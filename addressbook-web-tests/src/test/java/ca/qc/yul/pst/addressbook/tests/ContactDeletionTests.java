package ca.qc.yul.pst.addressbook.tests;

import org.testng.annotations.*;
import ca.qc.yul.pst.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {

    contactHelper.selectContact();
    contactHelper.deleteContacts();
    navigationHelper.returnToHomePage();
  }
}
