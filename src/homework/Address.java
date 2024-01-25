package homework;

public class Address {
    private String street;
    private int housNumber;

    public Address(String street, int housNumber) {
        this.street = street;
        this.housNumber = housNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHousNumber() {
        return housNumber;
    }

    @Override
    public String toString() {
        return "Address: " + street + "," + housNumber;
    }
}
