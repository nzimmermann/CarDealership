package com.dealership.system;

public class Employee extends User{

    Employee(String a, String b) {
        super(a,b);
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    private static String[] options = {""};

}
