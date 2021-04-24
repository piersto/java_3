package ca.qc.yul.pst.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {

    selectContact();
    deleteContacts();
    returnToHomePage();
  }
}
