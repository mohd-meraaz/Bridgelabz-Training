package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetToList {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
	    set.add(5);
	    set.add(10);
	    set.add(1);
	    System.out.println("Set              : "+set);
	    ArrayList<Integer> arr = new ArrayList<>(set);
	    Collections.sort(arr);
	    System.out.println("Sorted ArrayList : "+arr);
	}
}