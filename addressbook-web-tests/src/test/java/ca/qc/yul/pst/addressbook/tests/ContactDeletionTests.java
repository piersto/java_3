package ca.qc.yul.pst.addressbook.tests;

import org.testng.annotations.*;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {

    selectContact();
    deleteContacts();
    returnToHomePage();
  }
}
