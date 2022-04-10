package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose your race car");
        Scanner scanner=new Scanner(System.in);
        String car=scanner.nextLine();

        CarFactory carFactory=new CarFactory();
        Car car1=carFactory.creatCar(car);
        System.out.println("-------heres your"+car+"--------");
      car1.start();
      car1.accelerating();
      car1.braking();
      car1.turningoff();
    }
}
