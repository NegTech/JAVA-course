package com.company;

import java.io.*;
import java.util.Scanner;


public class ReadingThread implements Runnable {
    public void run(){

    }
File file=new File("D:\\javafile\\test.txt");
   Scanner scan=new Scanner(file);
   public ReadingThread() throws FileNotFoundException{
       while ((scan.hasNext())){
           System.out.println(scan.next());
       }
   }
}