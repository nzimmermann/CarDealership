package com.dealership.system;

import static com.dealership.system.AccountType.CUSTOMER;

public class Customer extends User {

    public Customer(String a, String b) {
        super(a,b);
        ac = CUSTOMER;
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    private String[] options;




}
