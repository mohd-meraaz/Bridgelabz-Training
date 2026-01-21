package com.collections;
import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(203);
		list.add(0);
		list.add(2);
		System.out.println("Before revers-");
		display(list);
		System.out.println("After reverse -");
		Collections.reverse(list);
		display(list);
	}
	public static void display(List<Integer> list) {
		for(Integer l : list) {
			System.out.print(l+" ");
		}
		System.out.println();
	}
}