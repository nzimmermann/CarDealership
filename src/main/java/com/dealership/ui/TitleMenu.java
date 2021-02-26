package com.dealership.ui;

import java.util.Scanner;

public class TitleMenu extends Menu{

    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_RESET = "\u001B[0m";
    private Scanner scan;

    private String title;


    public TitleMenu(Scanner s){
        title = "" +
                "Welcome To The Dealership" +
                "\n" +
                "\n" +
                "Would you like to Login or Register for a Customer Account\n";
        this.scan = s;
    }


    public String dynamicChoiceDisplay(){
        return "    (1)Login    (2)Register    ";
    }

    private String selection(){
        return "";
    }


    @Override
    public void displayMenu() {
        System.out.print(title);

        String inputString = "";
        System.out.println(inputString.length());
        char choice = 0;


        System.out.print(dynamicChoiceDisplay());
        while((inputString += scan.next()).length() <= 0 ){
            choice = inputString.charAt(0);
        }
        System.out.print("\r");


    }


}

