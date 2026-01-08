package com.stringandsorting.stringbuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {

    private static final int ITERATIONS = 1_000_000;
    private static final String TEXT = "hello";
    private static final String FILE_PATH = "src/com/stringandsorting/stringbuilder/largeTextFile.txt";

    public static void main(String[] args) {

        compareStringBuilderAndStringBuffer();
        compareFileReaderAndInputStreamReader();
    }

    // --------------------------------------------------
    // PART 1: StringBuilder vs StringBuffer
    // --------------------------------------------------
    private static void compareStringBuilderAndStringBuffer() {

        // StringBuilder
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(TEXT);
        }

        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");
    }

    // --------------------------------------------------
    // PART 2: FileReader vs InputStreamReader
    // --------------------------------------------------
    private static void compareFileReaderAndInputStreamReader() {

        // FileReader
        long start = System.currentTimeMillis();
        long wordCountFR = countWordsUsingFileReader();
        long end = System.currentTimeMillis();

        System.out.println("FileReader word count: " + wordCountFR);
        System.out.println("FileReader time: " + (end - start) + " ms");

        // InputStreamReader
        start = System.currentTimeMillis();
        long wordCountISR = countWordsUsingInputStreamReader();
        end = System.currentTimeMillis();

        System.out.println("InputStreamReader word count: " + wordCountISR);
        System.out.println("InputStreamReader time: " + (end - start) + " ms");
    }

    private static long countWordsUsingFileReader() {

        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.trim().isEmpty()
                        ? 0
                        : line.trim().split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }

        return wordCount;
    }

    private static long countWordsUsingInputStreamReader() {

        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILE_PATH),
                        StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.trim().isEmpty()
                        ? 0
                        : line.trim().split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }

        return wordCount;
    }
}
