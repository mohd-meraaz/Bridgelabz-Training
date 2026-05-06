package com.junit.testlistoperations;

import java.util.*;

public class ListManager {
	
	//addElement(List<Integer> list, int element): Adds an element to a list.

	public int addElement(List<Integer> list, int element){
		list.add(element);
		return element;
	}
	
	//removeElement(List<Integer> list, int element): Removes an element from a list.

	public boolean removeElement(List<Integer> list, int element) {
		if(list.isEmpty()) {
			return false;
		}
	    for(Integer a:list) {
	    	if(a==element) {
	    		list.remove(a);
	    		return true;
	    	}
	    }
	    return false;

	}
	
	//getSize(List<Integer> list): Returns the size of the list.

	public int getSize(List<Integer> list) {
		return list.size();
	}
}