package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:XE", "negin"
                            , "negin2003");
            System.out.println("connected");
            Statement stmt = con.createStatement();

            System.out.println("for registering into website pls fill the require information");
            System.out.println("NAME:");
            String name = scanner.next();
            System.out.println("PASS:");
            String pass = scanner.next();
            System.out.println("USERNAME:");
            String username = scanner.next();
            System.out.println("email:");
            String email = scanner.next();

            stmt.executeUpdate("insert into person(name,pass,username,email) values" +
                    "('" + name + "','" + pass + "','" + username + "','" + email + "')");
            System.out.println("values inserted ");


            System.out.println("do you want to logg in?");
            System.out.println("enter username:");
            String username1=scanner.next();
            System.out.println("enter password:");
            String pass1=scanner.next();

            if(username1.equals(username)&&pass1.equals(pass)){
                System.out.println("logged in");
            }else
                System.out.println("wrong information");


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
