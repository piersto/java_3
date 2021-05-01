package ca.qc.yul.pst.addressbook.model;

public class ContactData {

    private final String lastName;
    private String group;

    public ContactData(String lastName, String group) {
        this.lastName = lastName;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
