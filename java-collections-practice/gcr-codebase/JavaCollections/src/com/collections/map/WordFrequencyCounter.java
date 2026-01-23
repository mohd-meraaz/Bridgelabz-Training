package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordFrequencyCounter {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter text:");
	        String input = scanner.nextLine();

	        Map<String, Integer> wordCount = countWords(input);

	        System.out.println(wordCount);
	        scanner.close();
	    }

	 

	 public static Map<String, Integer> countWords(String text) {
	        Map<String, Integer> map = new HashMap<>();

	        // Convert to lower case and remove punctuation
	        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

	        // Split by whitespace
	        String[] words = text.split("\\s+");

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                map.put(word, map.getOrDefault(word, 0) + 1);
	            }
	        }

	        return map;
	    }
}
