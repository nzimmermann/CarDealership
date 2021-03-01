package com.dealership.ui;

public class OptionsMenu extends Menu{

    private String title;
    private String notice;

    @Override
    public int displayMenu() {
        return 0;
    }

    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
