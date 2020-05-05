package com.d3.prac.java8.optional;

import com.d3.prac.java8.model.Address;
import com.d3.prac.java8.model.User;

import java.util.ArrayList;
import java.util.Optional;

public class ReducedBoilerPlate {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1, new Address("James Wattstraat")));
        users.add(new User(2, new Address("Populirenlaan")));
        users.add(new User(3, new Address(null)));
        users.add(new User(4, new Address(null)));

        users.stream()
                .filter(u -> u.getAddress().getStreet() == null)
                .forEach(u -> System.out.println(u.getUserId() + ": Default Street"));

        ReducedBoilerPlate reducedBoilerPlate = new ReducedBoilerPlate();
        System.out.println("checkStreet normal: "+reducedBoilerPlate.checkStreet(users.get(2)));
        System.out.println("checkStreet optional: "+reducedBoilerPlate.checkStreetWithOptional(users.get(2)));

    }

    public String checkStreet(User user) {
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                String street = address.getStreet();
                if (street != null) {
                    return street;
                }
            }
        }
        return "not specified";
    }

    public String checkStreetWithOptional(User user) {
        Optional<User> optUser = Optional.of(user);
        Optional<Address> address = optUser.map(User::getAddress);
        return optUser
                .map(user1 -> user1.getAddress())
                .map(Address::getStreet)
                .orElse("not specified");
    }
}