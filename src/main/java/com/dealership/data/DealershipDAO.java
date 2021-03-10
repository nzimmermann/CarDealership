package com.dealership.data;

import com.dealership.config.ConnectionUtil;
import com.dealership.system.Customer;
import com.dealership.system.Employee;
import com.dealership.system.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class DealershipDAO {

    private ArrayList<String> allUsernames;

    public static boolean isRegisteredUser(String u_name){
        try {
            //System.out.println("Attempting:  SELECT USERNAME FROM USERS WHERE USERNAME = " + u_name);
            String sql = "select username from users where username = '" + u_name + "'";
            Statement statement = ConnectionUtil.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
        }
        catch (SQLException e) {
            return false;
        }
    }

    private static int checkEmploymentStatus(String username){
        try {
            //System.out.println("Attempting:  SELECT STATUS FROM USERS WHERE USERNAME = " + username);
            String sql = "select status from users where username = '" + username + "'";
            Statement statement = ConnectionUtil.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                return (int) rs.getObject(1);
            }
        }
        catch (SQLException e) {
            return -1;
        }
        return -1;
    }

    public static User makeSession(String username, String password){
        //todo: require password for user return
        //note: this method won't be called if user doesn't exist

        User online_user;
        int status = checkEmploymentStatus(username);

        switch (status){
            case 0:
            case 1:
                return new Employee(username,password);
            case 2:
                return new Customer(username,password);
        }

        return null;
    }



    public String checkData(String s){
        ResultSet rs;
        try {
            String sql = "select username from users";
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            rs = st.executeQuery(sql);

            ArrayList<String> usernames = new ArrayList<>();

            while(rs.next()){
                String temp = (String) rs.getObject(1);
                //System.out.println(rs.getObject(1));
                //System.out.println(temp);
                usernames.add(temp);
            }

            System.out.println(usernames);

            return "uhh...";

        } catch (SQLException e) {
            e.printStackTrace();
            return "something went wrong";
        }

    }

}
