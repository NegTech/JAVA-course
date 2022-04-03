package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Receiving reiciving = new Receiving();
        Scanner scanner = new Scanner(System.in);
        System.out.println("full name:");
        reiciving.name = scanner.nextLine();

        System.out.println("student membership number:");
        reiciving.number = scanner.nextDouble();

        System.out.println("fathers name:");
        Scanner input = new Scanner(System.in);
        reiciving.fathersname = input.nextLine();
        System.out.println("enter your 5 scores ");
        Double s1 =input.nextDouble();
        Double s2 =input.nextDouble();
        Double s3 =input.nextDouble();
        Double s4 =input.nextDouble();
        Double s5 =input.nextDouble();

        List<Double> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Scores obj=new Scores();
        obj.setScore1(s1);
        obj.setScore2(s2);
        obj.setScore3(s3);
        obj.setScore4(s4);
        obj.setScore5(s5);

        System.out.println("student specifications---->"+"name:"+reiciving.name);
        System.out.println("students number:"+reiciving.number);
        System.out.println("fathers name:"+reiciving.fathersname);
        System.out.println("subject scores:");
        System.out.println(obj.getScore1());
        System.out.println(obj.getScore2());
        System.out.println(obj.getScore3());
        System.out.println(obj.getScore4());
        System.out.println(obj.getScore5());

    }
}
