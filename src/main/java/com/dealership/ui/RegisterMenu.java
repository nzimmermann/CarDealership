package com.dealership.ui;

import com.dealership.config.ConnectionUtil;
import com.dealership.data.DealershipDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegisterMenu extends LoginMenu {

    private String notice;
    private String title;

    public RegisterMenu(Scanner sc){
        super(sc);
        this.scan = sc;
        System.out.println("Please create a username and password");
    }


    @Override
    public int displayMenu() {
        //System.out.print(title);
        String username = this.promptUsername(scan);
        String password = this.promptPassword(scan);

        //Todo: check database to confirm username isn't already taken
        //Todo: add new user's info to the database




        boolean user_exists = false;

        if(DealershipDAO.isRegisteredUser(username)){
            System.out.println("That account already exists...");
        } else {

            try {
                int nId = getNextId();
                String sql = "insert into users values ('" +
                        nId + "', '" + username + "', '" + password + "', " + 2 + ")";
                Statement statement = ConnectionUtil.getInstance().getConnection().createStatement();
                int i = statement.executeUpdate(sql);
            }
            catch (SQLException e) {
                e.printStackTrace();
                System.out.println("something went wrong");
            }

        }

        return 1;
    }


    public int getNextId(){
        try {
            String sql = "select * from getNextId()";
            Statement statement = ConnectionUtil.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
            return (int) rs.getObject(1);
        }
        catch (SQLException e) {
            return -1;
        }
    }

    @Override
    public void setNotice(String s) {
        notice = s;
    }
}
