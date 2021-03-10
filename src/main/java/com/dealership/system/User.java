package com.dealership.system;

import static com.dealership.system.AccountType.USER;

// todo: Consider making 'User' an Interface and use lambda syntax for incoming temp users

public class User extends Account{

    User(String a, String b) {
        super(a,b);
        ac = USER;
    }

    public AccountType getAc(){
        return ac;
    }

    @Override
    public String[] getOptions() {
        return options;
        // As a user, I can login.
        // As a user, I can register for a customer account.
    }



    private static String[] options = {"Login","Register Customer Account"};



}
