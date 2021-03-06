package com.dealership.ui;

import java.util.Scanner;

public abstract class Menu {

    protected Scanner scan;
    public abstract int getMaxOptions();
    public abstract int displayMenu();
    public abstract void setNotice(String s);

    public abstract String getName();

}
