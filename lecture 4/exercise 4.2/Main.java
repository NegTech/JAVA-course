
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ReicivingInformation receivingInformation=new ReicivingInformation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String fullname=scanner.nextLine();
        receivingInformation.fullname=fullname;

        System.out.println("enter your age ");
        Double age=scanner.nextDouble();
        receivingInformation.age=age;

        System.out.println("enter your email");
        Scanner input =new Scanner(System.in);
        String email=input.nextLine();
        receivingInformation.email=email;

        System.out.println("users name :" + receivingInformation.fullname);
        System.out.println("users age :"+receivingInformation.age);
        System.out.println("users email :"+receivingInformation.email);

        try {
            CloneClass cloneClass=new CloneClass(fullname,age,email);
            CloneClass cloneClass2=(CloneClass) cloneClass.clone();

            System.out.println("clone outputs:"+cloneClass.fullname + ","+ cloneClass.age+","+ cloneClass.email);
            System.out.println("---->"+cloneClass2.fullname + ","+ cloneClass2.age+","+cloneClass2.email);
        }catch (CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException");
        }


    }
}
