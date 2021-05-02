package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup
              (new GroupData("Group to be deleted", "Header", "Footer"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.getNavigationHelper().returnToHomePage();
  }
}
