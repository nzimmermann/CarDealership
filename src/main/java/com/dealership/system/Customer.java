package com.dealership.system;

public class Customer extends User {

    Customer(String a, String b) {
        super(a,b);
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    private String[] options;
}
