package com.dealership.ui;


import java.util.Scanner;

public class LoginMenu extends Menu{

    Scanner scan = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.print("Username: " + scan.nextLine());
        System.out.print("Password: " + scan.nextLine());
    }





}
