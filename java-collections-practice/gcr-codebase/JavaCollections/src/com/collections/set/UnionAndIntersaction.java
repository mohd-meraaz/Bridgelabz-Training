package com.collections.set;

import java.util.HashSet;

public class UnionAndIntersaction {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(11);
		set1.add(21);
		set1.add(31);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(32);
		set2.add(24);
		set2.add(25);
		System.out.println("Intersection of two sets: "+intersection(set1,set2));
	    union(set1,set2);
	    System.out.println("Union        : "+set1);
	}
	public static HashSet<Integer> union(HashSet<Integer> set1,HashSet<Integer>set2){
		set1.addAll(set2);
		return set1;
	}
	public static HashSet<Integer> intersection(HashSet<Integer> set1,HashSet<Integer> set2){
		HashSet<Integer> result = new HashSet<>();
		for(int a: set1) {
		  if(set2.contains(a)) {
				result.add(a);
		  }
		}
		
		return result;
	}
}