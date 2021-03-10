package com.dealership.ui;

import com.dealership.system.Employee;

import java.util.Scanner;

public class EmployeeMenu extends OptionsMenu{

    String options = "\n(1)Accept/Reject Offers        (2)Add Car \n" +
                       "(3)Remove Car                  (4)View All Payments\n";

    private int choice;

    public EmployeeMenu(Scanner sc){
        super(sc);
        setNotice("");
        this.scan = sc;
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
