package com.timecomplexity;

import java.io.*;

public class FileReadCompare {

    public static void main(String[] args) throws Exception {

        long s1 = System.nanoTime();
        BufferedReader fr = new BufferedReader(new FileReader("largeFile.txt"));
        while (fr.readLine() != null) {}
        fr.close();
        System.out.println("FileReader: " + (System.nanoTime() - s1));

        long s2 = System.nanoTime();
        BufferedReader isr = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("largeFile.txt")));
        while (isr.readLine() != null) {}
        isr.close();
        System.out.println("InputStreamReader: " + (System.nanoTime() - s2));
    }
}
