package com.stringandsorting.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpecificWord {

    public static void main(String[] args) throws Exception {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(read.readLine());

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = read.readLine();
        }

        System.out.print("Enter word you want to search: ");
        String word = read.readLine();

        System.out.println(searchSentence(sentences, word));
    }

    // Linear Search method
    public static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // first match
            }
        }
        return "Not Found";
    }
}
