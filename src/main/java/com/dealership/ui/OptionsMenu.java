package com.dealership.ui;

import java.util.Scanner;

public abstract class OptionsMenu extends LoginMenu{

    private String title;
    private String notice;

    public OptionsMenu(Scanner sc) {
        super(sc);
    }

    @Override
    public abstract int displayMenu();

    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
