package com.collections;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[]args) {
		ArrayList<Integer>arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    System.out.println("Before Removal : "+arr);
	    ArrayList<Integer> result = new ArrayList<>();
	    for(Integer a: arr) {
	    	if(!result.contains(a)) {
	    		result.add(a);
	    	}
	    }
	    System.out.println("After Removal  : "+result);
	}
}