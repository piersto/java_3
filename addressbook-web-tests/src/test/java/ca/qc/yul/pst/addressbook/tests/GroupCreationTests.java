package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(
                new GroupData("Group", null, "Group footer"));
        List<GroupData> after = app.getGroupHelper().getGroupList();
        app.getNavigationHelper().goToGroupPage();
        Assert.assertEquals(before.size() + 1, after.size());
    }
}
