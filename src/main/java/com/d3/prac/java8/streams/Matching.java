package com.d3.prac.java8.streams;

import com.d3.prac.java8.model.Address;
import com.d3.prac.java8.model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Matching {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        
        users.add(new User(1, new Address("James Wattstraat", Arrays.asList(205,306,703))));
        users.add(new User(2, new Address("Populirenlaan", Arrays.asList(183,184,703))));
        users.add(new User(3, new Address(null, Arrays.asList(999,998,703))));
        users.add(new User(4, new Address(null,Arrays.asList(888,887,703))));
        
        boolean anyMatch = users.stream().anyMatch(user -> user.getAddress().getPinCodes().contains(205));
        boolean allMatch = users.stream().allMatch(user -> user.getAddress().getPinCodes().contains(703));
        boolean noneMatch = users.stream().noneMatch(user -> user.getAddress().getPinCodes().contains(999));

        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
