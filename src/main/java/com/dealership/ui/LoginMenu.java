package com.dealership.ui;


import java.util.Scanner;

public class LoginMenu extends Menu {


    @Override
    public void displayMenu() {
        System.out.println("Please Login");
    }

    public String promptUsername(Scanner s){
        System.out.print("Username:  ");
        String USERNAME = s.next();
        return USERNAME;
    }

    public String promptPassword(Scanner s){
        System.out.print("Password:  ");
        String PASSWORD = s.next();
        return PASSWORD;
    }

}
