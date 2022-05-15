package com.company;

import java.io.*;
import java.util.Scanner;

public class CopyingThread extends ReadingThread implements Runnable {

String fileContent="//copy file.\n";
    public CopyingThread()throws IOException {
        Scanner scan=new Scanner(file);
        while (scan.hasNext()){
            fileContent=fileContent.concat(scan.next());
        }
        FileWriter copyingThread=new FileWriter("D:\\javafile\\copy.txt");

        copyingThread.write(fileContent);
        copyingThread.close();
        System.out.println("COPIED");

    }

}
