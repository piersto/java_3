package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;


public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().returnToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Smith", null, "[none]"));
      app.getNavigationHelper().returnToHomePage();
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteContacts();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(before.size() -1, after.size());
  }
}
