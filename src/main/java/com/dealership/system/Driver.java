package com.dealership.system;


import com.dealership.ui.LoginMenu;
import com.dealership.ui.Menu;
import com.dealership.ui.TitleMenu;

import java.util.Scanner;

public class Driver {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu ui = new TitleMenu(sc);
        int user_choice = 0;
        boolean staying = true;


        //Begin ui
        while(staying) {
            //user_choice = userInterface(ui,sc);

            switch (userInterface(ui,sc)){
                case 1:
                    ui = new LoginMenu();
                    break;
                case 2:
                    //System.out.println();
                    ui.setNotice("Needs implementing...\n");
                    break;
                default:
                    ui.setNotice("Please enter a valid input");
                    break;
            }
            System.out.print("\r\n\n\n\n");
        }

    }

    private static int userInterface(Menu ui,Scanner s){
        int choice = 0;

        while(choice == 0){
            choice = ui.displayMenu();
        }

        if(choice == 1 || choice == 2){
            return choice;
        } else {
            return 0;
        }

    }

}


//
//    //String s = "just end it here";
//    boolean B = true;
//
//        while(B){
//                B = false;
//
//                break;
//                }
//                ui.displayMenu();
//
//                int i = 3;
//                while(i > 0){
//
//                if(i-- == 1){
//                ui = new LoginMenu();
//                }
//                }
//


//LoginMenu login = new LoginMenu(sc);
// Login screen and checking username/password
//login.displayMenu();

