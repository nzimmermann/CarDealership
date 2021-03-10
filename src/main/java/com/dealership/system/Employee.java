package com.dealership.system;

import static com.dealership.system.AccountType.EMPLOYEE;

public class Employee extends User{

    public Employee(String a, String b) {
        super(a,b);
        ac = EMPLOYEE;
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    private static String[] options = {""};

}
