package ca.qc.yul.pst.addressbook.model;

import java.util.Objects;

public class ContactData {

    private final String id;
    private final String lastName;
    private final String firstName;
    private String group;

    public String getId() {
        return id;
    }

    public ContactData(String lastName, String firstName, String group) {
        this.id = null;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }
    public ContactData(String id, String lastName, String firstName, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(id, that.id) && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
