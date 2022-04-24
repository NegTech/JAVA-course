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
                    ("jdbc:oracle:thin:@localhost:1521:XE", "negin3"
                            , "negin2003");
            System.out.println("connected");
            Statement stmt = con.createStatement();

            int id = 1;
            while (id > 0) {
                System.out.print("id");
                id = scanner.nextInt();
                if (id == 0)
                    break;

                System.out.println("code:");
                int code = scanner.nextInt();

                System.out.println(" name:");
                String name = scanner.next();

                System.out.println("National Code:");
                int nationalcode = scanner.nextInt();

                System.out.println("fathers name:");
                String fathersname = scanner.next();

                System.out.println("job:");
                String job = scanner.next();

                System.out.println("income:");
                int income = scanner.nextInt();

                System.out.println("year of work :");
                int yow = scanner.nextInt();


                stmt.executeUpdate("insert into person (id,code ,name,nationalcode,fathersname,job,income,yow)" +
                        "values('" + id + "','" + code + "','" + name + "','" + nationalcode + "','" + fathersname
                        + "','" + job + "','" + income + "','" + yow + "')");
            }
            System.out.println("values inserted ");
            System.out.println("do you want to delete information?");

            String ans = scanner.next();
            if (ans.equals("yes")) {
                System.out.println("which code");
                int newcode = scanner.nextInt();
                stmt.executeUpdate("delete from person where code='"+newcode+"'");
                System.out.println("deleted");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}