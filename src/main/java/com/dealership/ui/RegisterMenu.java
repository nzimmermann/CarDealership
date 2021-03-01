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
        return 0;
    }

    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
