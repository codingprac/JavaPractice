package com.d3.prac.java8.model;

public class User {
    int userId;
    Address address;

    public
    User(int userId, Address address) {
        this.userId = userId;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public Address getAddress() {
        return address;
    }
}
