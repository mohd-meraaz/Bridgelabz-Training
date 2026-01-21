package com.collections;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap; 
 
public class FindFrequency {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("mango");
		list.add("berry");
		
		freqCompute(list);
	}
	
	public static void freqCompute(List<String> list) {
		Map<String,Integer> freq = new HashMap<>();
		
		for(String s : list) {
			freq.put(s, freq.getOrDefault(s, 0)+1);
		}
		
		//display
		for(var c:freq.entrySet()) {
			System.out.println(c.getKey() + "="+c.getValue());
		}
	}
}
