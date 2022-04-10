package com.company;

public class Bmw implements Car{
    @Override
    public void start() {
        System.out.println("bmw start");

    }

    @Override
    public void accelerating() {
        System.out.println("bmw accelerate");

    }

    @Override
    public void braking() {
        System.out.println("bmw brake");

    }

    @Override
    public void turningoff() {
        System.out.println("bmw turn off");

    }


}
