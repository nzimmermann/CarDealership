package com.dealership.ui;

public abstract class OptionsMenu extends Menu{

    private String title;
    private String notice;

    @Override
    public abstract int displayMenu();

    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
