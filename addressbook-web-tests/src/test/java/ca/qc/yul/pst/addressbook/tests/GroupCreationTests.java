package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(
                new GroupData("Group", null, "Group footer"));
        int after = app.getGroupHelper().getGroupCount();
        app.getNavigationHelper().goToGroupPage();
        Assert.assertEquals(before + 1, after);
    }
}
