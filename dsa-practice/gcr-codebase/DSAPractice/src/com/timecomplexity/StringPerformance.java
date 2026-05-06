package com.timecomplexity;

public class StringPerformance {

    public static void main(String[] args) {

        int n = 100000;

        long s1 = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++)
            str += "a";
        System.out.println("String: " + (System.nanoTime() - s1));

        long s2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append("a");
        System.out.println("Builder: " + (System.nanoTime() - s2));

        long s3 = System.nanoTime();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < n; i++)
            bf.append("a");
        System.out.println("Buffer: " + (System.nanoTime() - s3));
    }
}
