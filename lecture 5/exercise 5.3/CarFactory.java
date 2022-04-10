package com.company;

public class CarFactory {


    public Car creatCar(String car) {
        if (car != null) {

            switch (car) {
                case "benz":
                    return new Benz();
                case "hyondai":
                    return new Hyondai();
                case "bmw":
                    return new Bmw();
                default:
                    throw new IllegalArgumentException("Unknown car " + car);

            }
        } else
            return null;
    }
}
