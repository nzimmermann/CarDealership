package com.dealership.ui;

//import com.dealership.config.ConnectionUtil;
import com.dealership.data.DealershipDAO;
import com.dealership.system.Customer;
import com.dealership.system.User;

import java.util.Scanner;

import com.dealership.system.Employee;

public class LoginMenu extends Menu {

    //private static DealershipDAO ddb;

    private static int attempts = 3;
    private String notice;
    public static String username = "";
    protected static User login_user;

    public static User attemptLogin(String user, String pwd){

        if( DealershipDAO.isRegisteredUser(user) ){
            System.out.println("Loggin you in now...");
            login_user = DealershipDAO.makeSession(user,pwd);
            username = user;
            return login_user;
        } else {
            System.out.println("Couldn't find you in the database...");
        }

        return null;
    }

    public LoginMenu(Scanner sc){
        this.scan = sc;
    }



    @Override
    public int getMaxOptions() {
        return 2;
    }

    @Override
    public int displayMenu() {
        // Login screen and checking username/password

        int login_success = -1;

        while(attempts > 0){

            System.out.println("Enter your information.");
            String username = this.promptUsername(scan);
            String password = this.promptPassword(scan);


            login_user = attemptLogin(username,password);

            if( login_user instanceof Employee ) {
                System.out.println("You're logged in! And clocked in!");
                return 10;
            } else if(login_user instanceof Customer){
                System.out.println("Welcome valued customer!");
                return 20;
            }
            else {
                System.out.println("Incorrect username or password... try again");
                attempts -= 1;
                //System.out.println(checkData("none"));
            }
        }

        System.out.println("\n\nAttempted login too many times\nreturning to main menu\n");
        return login_success;
    }

    @Override
    public void setNotice(String s){
        notice = s;
    }

    @Override
    public String getName() {
        return username;
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
