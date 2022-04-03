package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("what information do you want from the profile:");
        Scanner scanner =new Scanner(System.in);
        String password=scanner.nextLine();

        Mahya mahya=new Mahya();
        switch(password){
            case "name":
                System.out.println(mahya.getName());
                break;

            case "family":
                System.out.println(mahya.getFamily());
                break;

            case "username":
                System.out.println(mahya.getUsername());
                break;

            case "pass":
                System.out.println(mahya.getPass());
                break;

            case "job":
                System.out.println(mahya.getJob());
        }

    }
}
