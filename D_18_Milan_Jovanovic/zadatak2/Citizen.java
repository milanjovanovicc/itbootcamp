package zadatak2;

import java.util.ArrayList;

public class Citizen {

    private String firstName;
    private String lastName;
    private int birthYear;
    private String personalID;
    private Address addresses;

    public Citizen() {
    }

    public Citizen(String firstName, String lastName, int birthYear, String personalID, Address addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.personalID = personalID;
        this.addresses = addresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getPersonalID() {
        return personalID;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
            this.addresses = addresses;

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + birthYear + " " + personalID + " " + "\r\n" +
                addresses;
    }
}
