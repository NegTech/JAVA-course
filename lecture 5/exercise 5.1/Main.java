package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("name:");
        String name=scanner.nextLine();
        System.out.println("username:");
        Scanner un=new Scanner(System.in);
        String username=un.nextLine();
        System.out.println("password:");
        Scanner pass=new Scanner(System.in);
        String password=pass.nextLine();
        System.out.println("age:");
        String age=scanner.nextLine();
        System.out.println("educations:");
        Scanner edu=new Scanner(System.in);
        String education=edu.nextLine();
        System.out.println("phone number:");
        String phonenumber=scanner.nextLine();
        System.out.println("address");
        Scanner add=new Scanner(System.in);
        String address=add.nextLine();

        Information information=new Information().setName(name).setUsername(username).setPassword(password).setAge(age)
                .setEducation(education).setPhonenumber(phonenumber).setAddress(address);

        System.out.println(information.getName());
        System.out.println(information.getUsername());
        System.out.println(information.getPassword());
        System.out.println(information.getAge());
        System.out.println(information.getEducation());
        System.out.println(information.getPhonenumber());
        System.out.println(information.getAddress());
    }
}
