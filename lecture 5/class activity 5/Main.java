package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] input=new String[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        input[0]=scanner.next();
        int a =Integer.parseInt(input[0]);
        System.out.println("mark:");
        Scanner mark=new Scanner(System.in);
         input[1]= mark.next();

        System.out.println("number 2:");
        input[2]=scanner.next();
        int b=Integer.parseInt(input[2]);

        CalculaterFactory calculaterFactory=new CalculaterFactory();
        Calculater calculater=calculaterFactory.makeCalculater(input);
        System.out.println("answer:");
        calculater.calculateuser(a,b);
    }
}
