package com.dealership.system;

import java.sql.*;

import com.dealership.config.ConnectionUtil;
import com.dealership.data.DealershipDAO;
import com.dealership.ui.*;
import sun.rmi.runtime.Log;

import java.util.Scanner;


public class Driver {

    private static User activeUser;
    private static int user_offset;
    public static String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu ui = new TitleMenu(sc);
        int user_choice = 0;
        boolean interfacing = true;
        user_offset = 0;


        //Begin ui
        while(interfacing) {

            switch ((userInterface(ui)+user_offset)){
                case 1: //go to login menu
                    ui = new LoginMenu(sc);
                    name = ui.getName();
                    //activeUser = DealershipDAO.makeSession();
                    break;

                case 2: //register new customer menu
                    ui = new RegisterMenu(sc);
                    break;

                case 10: //employee
                    ui = new EmployeeMenu(sc);
                    break;

                case 11:
                    break;
                case 12:
                case 13:
                case 14:
                    break;


                case 20: //customer
                    System.out.println("Hello " + name);
                    ui = new CustomerMenu(sc);
                    break;

                case 21:
                    int v = viewLot();
                    break;
                case 22:
                    int offer = makeOffer(sc,ui.getName());
                    break;
                case 23:
                case 24:
                    break;

                case -1: //done with application
                    System.out.println("Exiting application...");
                    interfacing = false;
                    break;
                default:
                    ui.setNotice("Please enter a valid input");
                    break;
            }

        }
    }


    private static int manageOffers(){
        return 0;
    }

    private static int userInterface(Menu ui){
        int choice = 0;
        int maxOptions = ui.getMaxOptions();

        while(choice == 0){
            choice = ui.displayMenu();
        }

        if(choice >= 1 && choice <= maxOptions){
            return choice;
        }
        else if(choice == 10){ // employee logging in
            user_offset = 10;
            return 0;
        }
        else if(choice == 20){ // customer logging in
            user_offset = 20;
            return 0;
        }
        else if(choice == -1){  // exit
            user_offset = 0;
            return choice;
        }
        else {
            return 0;
        }

    }

    private static int makeOffer(Scanner scan, String customer_name){

        String sql1 = "select id from users where username = '" + customer_name + "'";
        int customer_id = 0;

        try{
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql1);
            if(rs.next()){
                customer_id = (int) rs.getObject(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        System.out.print("Enter which car: ");
        int car_id = scan.nextInt();

        String sql2 = "";

        String sql = "insert into offers values ('" + customer_id + "', " + "'" + car_id + "')";

        try{
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            int i = st.executeUpdate(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }


        return 1;
    }

    private static int viewLot(){
        String sql = "select * from lot";
        try{
            Statement st = ConnectionUtil.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("ID\t\tMake\t\tModel\t\tyear\t\tprice\t\tavailable");
            while(rs.next()){
                for(int i = 1; i <= 6; i++ ){
                    System.out.print(rs.getObject(i) + "\t\t");
                    if(i==3){
                        System.out.print("\t");
                    }
                }
                System.out.println("");

            }
            return 1;
        } catch (SQLException e){
            e.printStackTrace();
            return -1;
        }

    }

}
