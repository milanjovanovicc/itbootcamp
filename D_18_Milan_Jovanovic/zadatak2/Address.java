package zadatak2;

public class Address {

    private String street;
    private String streetNumber;
    private String apartmentNumber;
    private String zipCode;
    private String city;

    public Address(String street, String streetNumber, String apartmentNumber, String zipCode, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return this.street + " " + this.streetNumber + " " + this.apartmentNumber + " " + this.zipCode + " " + this.city;
    }
}
