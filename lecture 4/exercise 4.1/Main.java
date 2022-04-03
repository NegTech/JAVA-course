package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your name");
        String name1=scanner.nextLine();

        System.out.println("enter your student number");
         double studentnum1=scanner.nextDouble();

        System.out.println("enter your gpa");
         double gpa1=scanner.nextDouble();

        Map map = new HashMap();
        map.put("name",name1);
        map.put("studentnum",studentnum1);
        map.put("gpa",gpa1);
        System.out.println(map.get("name"));
        System.out.println(map.get("studentnum"));
        System.out.println(map.get("gpa"));
    }
}
