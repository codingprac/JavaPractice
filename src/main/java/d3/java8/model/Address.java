package d3.java8.model;

import java.util.List;

public class Address {

    String street;
    List<Integer> pinCodes;

    public Address(String street) {
        this.street = street;
    }

    public Address(String street, List<Integer> pinCodes) {
        this.street = street;
        this.pinCodes = pinCodes;
    }

    public String getStreet() {
        return street;
    }

    public List<Integer> getPinCodes() {
        return pinCodes;
    }
}
