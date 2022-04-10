package com.company;

public class Benz implements Car{
    @Override
    public void start() {
        System.out.println("benz start");
    }

    @Override
    public void accelerating() {
        System.out.println("benz accelerate");
    }

    @Override
    public void braking() {
        System.out.println("benz brake");
    }

    @Override
    public void turningoff() {
        System.out.println("benz turn off");
    }


}
