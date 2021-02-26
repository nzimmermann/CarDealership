package com.dealership.system;


import com.dealership.ui.LoginMenu;
import com.dealership.ui.Menu;
import com.dealership.ui.TitleMenu;

import java.util.Scanner;

public class Driver {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu ui;
        ui = new TitleMenu(sc);
        int user_choice;

        //Begin ui
        user_choice = userInterface(ui);

        switch (user_choice){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }

    }

    public static int userInterface(Menu ui){
        return 0;
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


//LoginMenu login = new LoginMenu(sc);
// Login screen and checking username/password
//login.displayMenu();

