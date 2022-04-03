package com.company;

public class CloneClass implements Cloneable{
    public String fullname;
    public Double age;
    public String email;

    CloneClass(String fullname,Double age,String email){
        this.fullname=fullname;
        this.age=age;
        this.email=email;

    }
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}

