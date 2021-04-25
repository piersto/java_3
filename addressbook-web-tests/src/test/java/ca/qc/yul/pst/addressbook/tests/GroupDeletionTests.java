package ca.qc.yul.pst.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    navigationHelper.goToGroupPage();
    groupHelper.selectGroup();
    groupHelper.deleteSelectedGroups();
    groupHelper.returnToGroupPage();
    navigationHelper.returnToHomePage();
  }
}
