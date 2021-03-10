package com.dealership.ui;

import java.util.Scanner;

public class TitleMenu extends Menu{

    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_RESET = "\u001B[0m";
    private Scanner scan;
    private String title, choices;
    private int choice;
    private String notice = "this is the notice";

    @Override
    public int getMaxOptions() {
        return 2;
    }

    public TitleMenu(Scanner sc){
        setNotice("");
        this.scan = sc;
        choices = "    (1)Login    (2)Register";
        choice = 0;
        System.out.println("Welcome To The Dealership\n");
    }


    @Override
    public void setNotice(String s){
        notice = s;
        title = "\n" + notice + "\n" +
                "Would you like to Login or Register for a Customer Account\n    (1)Login    (2)Register";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int displayMenu() {
        System.out.println(title);
        System.out.print(">>>> ");
        choice = scan.nextInt();
        return choice;
    }

}

