package com.dealership.ui;

import com.dealership.system.Customer;

import java.util.Scanner;
public class CustomerMenu extends OptionsMenu {

    String options = "\n(1)View Lot        (2)Make Offer \n" +
                     "(3)View My Car's   (4)Check Remaining Payments\n";

    private int choice;

    public CustomerMenu(Scanner sc){
        super(sc);
        setNotice("");
        this.scan = sc;
        System.out.println(getName());
    }

    @Override
    public int getMaxOptions() {
        return 4;
    }

    @Override
    public int displayMenu() {
        System.out.print(options);
        System.out.print(">>>> ");

        choice = scan.nextInt();
        return choice;
    }



}
