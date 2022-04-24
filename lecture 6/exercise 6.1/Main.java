package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:XE", "neginn"
                            , "negin2003");
            System.out.println("connected");
            Statement stmt = con.createStatement();
            int id = 1;
            while (id > 0) {
                System.out.print("id");
                id = scanner.nextInt();
                if (id == 0)
                    break;
                System.out.println("user code");
                int code = scanner.nextInt();
                System.out.println("user name");
                String name = scanner.next();
                System.out.println("user email");
                String email = scanner.next();
                System.out.println("user password");
                String pass = scanner.next();
                System.out.println("user age");
                int year = scanner.nextInt();
                System.out.println(" user education");
                String edu = scanner.next();

                stmt.executeUpdate("insert into person (id,code,name,email,pass,year,edu)" +
                        "values('"+id+"','" + code + "','" + name + "','" + email
                        + "','" + pass + "','" + year + "','" + edu + "')");
            }
            System.out.println("values inserted");

            System.out.println("do you want to update your information?");

            String ans= scanner.next();
            if (ans.equals("yes")){
                System.out.println("which code");
                int newcode= scanner.nextInt();
                System.out.println("what information ?");
                String inform= scanner.next();
                switch (inform){

                    case "name":
                        System.out.println("enter the new name");
                        String newname=scanner.next();
                        stmt.executeUpdate("update person set username='"+newname+"' where code ='"+newcode+"'");
                        break;
                    case "email":
                        System.out.println("enter the new email");
                        String newemail=scanner.next();
                        stmt.executeUpdate("update person set email='"+newemail+"' where code ='"+newcode+"'");
                        break;
                    case "password":
                        System.out.println("enter the new password");
                        String newpass= scanner.next();
                        stmt.executeUpdate("update person set pass='"+newpass+"' where code ='"+newcode+"'");
                        break;
                    case "age":
                        System.out.println("enter the new age");
                        int newage= scanner.nextInt();
                        stmt.executeUpdate("update person set year='"+newage+"' where code ='"+newcode+"'");
                        break;
                    case "education":
                        System.out.println("enter the new education");
                        String newedu=scanner.next();
                        stmt.executeUpdate("update person set education='"+newedu+"' where code ='"+newcode+"'");
                        break;

                }System.out.println("updated");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
