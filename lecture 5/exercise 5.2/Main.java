package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the required information to register first"+"  "+"name:");
        String name =scanner.nextLine();
        System.out.println("age:");
        int age =scanner.nextInt();
        System.out.println("email :");
        Scanner el=new Scanner(System.in);
        String email=el.nextLine();
        System.out.println("email's password:");
        Scanner input=new Scanner(System.in);
        String password=input.nextLine();

        System.out.println("------------contact properties---------");

        Singleton.getInstance().name(name);
        Singleton.getInstance().age(age);
        Singleton.getInstance().email(email);
        Singleton.getInstance().pass(password);
        System.out.println("If the information shown is incomplete, please re-enter the information ");
    }
}
