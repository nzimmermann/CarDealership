package com.dealership.system;


import com.dealership.ui.LoginMenu;

import java.util.Scanner;

public class Driver {

private static boolean checkCredentials(String u,String p){
    return (u.length() > 0 && p.length() > 0);
    //TODO: request user credentials verification in database
}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LoginMenu login = new LoginMenu();

        System.out.println("Welcome to The Dealership\n");


        // Login screen and checking username/password
        login.displayMenu();
        while(true){
            String username = login.promptUsername(s);
            String password = login.promptPassword(s);

            if( checkCredentials(username,password) ) {
                System.out.println("You've been logged in!");
                break;
            } else {
                System.out.println("Incorrect username or password... try again");
            }
        }



        while(true){

        }




    }

}
