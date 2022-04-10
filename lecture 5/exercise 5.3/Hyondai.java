package com.company;

public class Hyondai implements Car{
    @Override
    public void start() {
        System.out.println("hyondai start");

    }

    @Override
    public void accelerating() {
        System.out.println("Hyondai accelerate");

    }

    @Override
    public void braking() {
        System.out.println("hyondai brake");

    }

    @Override
    public void turningoff() {
        System.out.println("hyondai turn off");

    }


}
