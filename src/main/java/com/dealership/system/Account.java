package com.dealership.system;

public abstract class Account {

    Account(String username, String password){
        un = username;
        pw = password;
    }

    protected String un;
    private String pw;
    protected AccountType ac;

    public abstract String[] getOptions();


}
