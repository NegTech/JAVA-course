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
                    ("jdbc:oracle:thin:@localhost:1521:XE", "negin2"
                            , "negin2003");
            System.out.println("connected");
            Statement stmt = con.createStatement();

            int id = 1;
            while (id > 0) {
                System.out.print("id");
                id = scanner.nextInt();
                if (id == 0)
                    break;

                System.out.println("student number:");
                int stnum = scanner.nextInt();

                System.out.println("students name:");
                String stname = scanner.next();

                System.out.println("year:");
                int styear = scanner.nextInt();

                System.out.println("gpa:");
                float gpa = scanner.nextInt();

                stmt.executeUpdate("insert into person (id,stnum,stname,styear,gpa)" +
                        "values('" + id + "','" + stnum + "','" + stname + "','" + styear + "','" + gpa + "')");
            }
            System.out.println("values inserted ");

            System.out.println("updating information");
            System.out.println("student number?");
            int stnum = scanner.nextInt();
            System.out.println("wich information?");
            String type = scanner.next();
            switch (type) {
                case "name":
                    System.out.println("new name:");
                    String newname = scanner.next();
                    stmt.executeUpdate("update person set name='" + newname + "' where stnum='" + stnum + "'");
                    break;
                case "year":
                    System.out.println("new year:");
                    int newyear = scanner.nextInt();
                    stmt.executeUpdate("update person set styear='" + newyear + "' where stnum='" + stnum + "'");
                    break;
                case "gpa":
                    System.out.println("new gpa:");
                    float newgpa = scanner.nextInt();
                    stmt.executeUpdate("update person set gpa='" + newgpa + "' where stnum='" + stnum + "'");
                    break;
            }
                    System.out.println("deleting information");
                    System.out.println("for which st number ");
                    int stnumber= scanner.nextInt();
                    stmt.executeUpdate("delete from person where stnum='"+stnumber+"'");
            System.out.println("deleted");
    }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

