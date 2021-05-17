package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup
              (new GroupData("Group to be deleted", "Header", "Footer"));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    app.getNavigationHelper().returnToHomePage();
    Assert.assertEquals(before.size() - 1, after.size());
  }
}
