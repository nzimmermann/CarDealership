package com.dealership.system;

import java.sql.*;

import com.dealership.config.ConnectionUtil;
import com.dealership.data.DealershipDAO;
import com.dealership.ui.*;
import sun.rmi.runtime.Log;

import java.util.Scanner;


public class Driver {

    private static User activeUser;
    private static int user_offset;
    public static String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu ui = new TitleMenu(sc);
        int user_choice = 0;
        boolean staying = true;
        user_offset = 0;


        //Begin ui
        while(staying) {

            switch ((userInterface(ui)+user_offset)){
                case 1: //go to login menu
                    ui = new LoginMenu(sc);
                    name = ui.getName();
                    //activeUser = DealershipDAO.makeSession();
                    break;

                case 2: //register new customer menu
                    ui = new RegisterMenu(sc);
                    break;

                case 10: //employee
                    ui = new EmployeeMenu(sc);
                    break;

                case 11:
                case 12:
                case 13:
                case 14:
                    break;


                case 20: //customer
                    System.out.println("Hello " + name);
                    ui = new CustomerMenu(sc);
                    break;

                case 21:
                case 22:
                case 23:
                case 24:
                    break;

                case -1: //done with application
                    System.out.println("Exiting application...");
                    staying = false;
                    break;
                default:
                    ui.setNotice("Please enter a valid input");
                    break;
            }

        }
    }



    private static int userInterface(Menu ui){
        int choice = 0;
        int maxOptions = ui.getMaxOptions();

        while(choice == 0){
            choice = ui.displayMenu();
        }

        if(choice >= 1 && choice <= maxOptions){
            return choice;
        }
        else if(choice == 10){ // employee logging in
            user_offset = 10;
            return 0;
        }
        else if(choice == 20){ // customer logging in
            user_offset = 20;
            return 0;
        }
        else if(choice == -1){  // exit
            return choice;
        }
        else {
            return 0;
        }

    }





}
