package com.collections.set;

import java.util.HashSet;

public class SymmetricDifference {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set Number 1         : "+set1);
		System.out.println("Set Numbrr 2         : "+set2);
		System.out.println("Sysmetric difference : "+symmetric(set1,set2));
	}
	public static HashSet<Integer> symmetric(HashSet<Integer>set1, HashSet<Integer> set2) {
		HashSet<Integer> result = new HashSet<>();
		for(int a : set2) {
			if(!set1.contains(a)) {
				result.add(a);
			}
		}
		for(int a : set1) {
			if(!set2.contains(a)) {
				result.add(a);
			}
		}
		return result;
	}
}