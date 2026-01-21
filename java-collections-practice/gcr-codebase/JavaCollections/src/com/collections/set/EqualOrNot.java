package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class EqualOrNot {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(1);
		
		if(check(set1,set2)) {
			System.out.println("The Sets are equal");
		}else {
			System.out.println("The sets are not equal");
		}
	}
	public static boolean check(Set<Integer> set1,Set<Integer> set2) {
		for(int a: set1) {
			if(!set2.contains(a)) {
				return false;
			}
		}
		return true;
	}
}