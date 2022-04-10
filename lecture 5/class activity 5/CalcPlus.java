package com.company;

public class CalcPlus implements Calculater {

    @Override
    public void calculateuser(int a,int b) {
        int plus=a+b;
        System.out.println(plus);
    }
}
