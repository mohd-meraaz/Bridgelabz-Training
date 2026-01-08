package com.stringandsorting.stringbuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try (BufferedReader read =
                     new BufferedReader(new FileReader("src/com/stringandsorting/stringbuilder/TestFile.txt"))) {

            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
