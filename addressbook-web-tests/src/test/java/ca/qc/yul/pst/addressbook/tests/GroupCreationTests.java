package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(
                new GroupData("Group", null, "Group footer"));
        }
}
