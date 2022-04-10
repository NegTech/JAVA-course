package com.company;

public class CalcMinus implements Calculater {

    @Override
    public void calculateuser(int a ,int b) {
        int minus=a-b;
        System.out.println(minus);
    }
}
