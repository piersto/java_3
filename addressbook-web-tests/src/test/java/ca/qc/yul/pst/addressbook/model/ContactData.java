package ca.qc.yul.pst.addressbook.model;

import java.util.Objects;

public class ContactData {

    private int id;
    private final String lastName;
    private final String firstName;
    private String group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName);
    }

    public ContactData(String lastName, String firstName, String group) {
        this.id = 0;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }
    public ContactData(int id, String lastName, String firstName, String group) {
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
}
