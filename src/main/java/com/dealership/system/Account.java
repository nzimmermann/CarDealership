package com.dealership.system;

import com.sun.scenario.effect.impl.HeapImage;
import javafx.scene.layout.Priority;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class Account {

    protected String un; //username
    private String pw;   //password
    protected AccountType ac;

    Account(String username, String password){
        un = username;
        pw = password;
    }



    public abstract String[] getOptions();

}
