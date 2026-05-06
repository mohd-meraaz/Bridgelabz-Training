package com.collections.list;

import java.util.LinkedList;

public class FindNthLastElements {
	public static void main(String[] args) {
    	LinkedList<String> list = new LinkedList<>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("D");
    	list.add("E");
    	int n = 2;
    	int i =1;
    	while(i<n) {
    		list.pollLast();
    		i++;
    	}
    	System.out.println("N Last Elemet is : "+list.pollLast());
    }
}
