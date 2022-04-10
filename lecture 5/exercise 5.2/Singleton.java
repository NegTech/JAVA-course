package com.company;

public class Singleton {
public void name(String name){
    System.out.println("contacts name:"+name);
}
public void age(int age){
    System.out.println("contacts age :"+ age);
}
   public void email(String email){
       System.out.println("contacts email:"+email);
   }
   public void pass(String password){
       System.out.println("contacts password:"+password);
   }
private Singleton(){}
    private static Singleton singleton=new Singleton();
    public static Singleton getInstance(){return singleton;}


}
