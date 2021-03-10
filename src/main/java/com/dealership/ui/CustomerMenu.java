package com.dealership.ui;

import com.dealership.config.ConnectionUtil;
import com.dealership.system.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        return 5;
    }

    @Override
    public int displayMenu() {
        System.out.print(options);
        System.out.print(">>>> ");

        choice = scan.nextInt();
        return choice;
    }

//    private static int viewLot(){
//        String sql = "select * from lot";
//        try{
//            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            System.out.println("ID    Make    Model    year    price    available");
//            while(rs.next()){
//                for(int i = 1; i <= 5; i++ ){
//                    System.out.print(rs.getObject(i) + "   ");
//                }
//                System.out.println("");
//                //System.out.println(rs.getObject());
//
//            }
//            return 1;
//        } catch (SQLException e){
//            e.printStackTrace();
//            return -1;
//        }
//
//    }

}
