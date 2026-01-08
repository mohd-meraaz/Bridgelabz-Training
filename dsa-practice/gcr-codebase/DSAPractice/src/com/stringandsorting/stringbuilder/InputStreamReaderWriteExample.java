package com.stringandsorting.stringbuilder;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderWriteExample {

    public static void main(String[] args) {

        System.out.println("Enter text (type 'exit' to stop):");

        try (
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("userInput.txt", true)
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }

                writer.write(line);
                writer.write(System.lineSeparator());
            }

            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
