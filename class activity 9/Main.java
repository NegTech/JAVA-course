package com.company;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
ReadingThread readingThread=new ReadingThread();
Thread thraed1=new Thread(readingThread);

CopyingThread copyingThread=new CopyingThread();
Thread thread2=new Thread(copyingThread);

thraed1.start();
try {
    thraed1.join();
}catch (InterruptedException e){
    e.printStackTrace();
}
thread2.start();
    }
}
