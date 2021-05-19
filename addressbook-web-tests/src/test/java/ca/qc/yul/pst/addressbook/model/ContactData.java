package ca.qc.yul.pst.addressbook.model;

public class ContactData {

    private final String lastName;
    private final String firstName;
    private String group;

    public ContactData(String lastName, String firstName, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
