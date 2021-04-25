package ca.qc.yul.pst.addressbook.tests;

import ca.qc.yul.pst.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        navigationHelper.goToGroupPage();
        groupHelper.initGroupCreation();
        groupHelper.fillGroupForm(new GroupData("Group", "group header", "Group footer"));
        groupHelper.submitGroupCreation();
        groupHelper.returnToGroupPage();
    }

}
