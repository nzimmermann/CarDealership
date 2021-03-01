package com.dealership.ui;


import java.util.Scanner;

public class LoginMenu extends Menu {

    private static int attempts = 3;
    private String notice;

    private static boolean checkCredentials(String u,String p){
        return true; //(u.length() > 0 && p.length() > 0);
        //TODO: request user credentials verification in database
    }

    public LoginMenu(Scanner sc){
        this.scan = sc;

    }

    @Override
    public int displayMenu() {
        // Login screen and checking username/password
        while(attempts > 0){

            System.out.println("Enter your information.");
            String username = this.promptUsername(scan);
            String password = this.promptPassword(scan);

            if( checkCredentials(username,password) ) {
                System.out.println("You've been logged in!");
                break;
            } else {
                System.out.println("Incorrect username or password... try again");
                attempts -= 1;
            }
        }
        return 0;
    }

    @Override
    public void setNotice(String s){
        notice = s;
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
