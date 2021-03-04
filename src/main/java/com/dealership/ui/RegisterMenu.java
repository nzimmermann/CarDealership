package com.dealership.ui;

import java.util.Scanner;

public class RegisterMenu extends LoginMenu {

    private String notice;
    private String title;

    public RegisterMenu(Scanner sc){
        super(sc);
        this.scan = sc;
        System.out.println("Please create a username and password");
    }


    @Override
    public int displayMenu() {
        //System.out.print(title);
        String username = this.promptUsername(scan);
        String password = this.promptPassword(scan);

        //Todo: check database to confirm username isn't already taken
        //Todo: add new user's info to the database
        boolean user_exists = false;

        if(user_exists){
            System.out.println("It looks like you already have an account.");
        } else {
            System.out.println("You have been registered! Now you can login.");
        }

        return 1;
    }



    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
