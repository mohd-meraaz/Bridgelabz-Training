package com.junit.testlistoperations;

import java.util.*;

public class ListManager {
	
	//add
	public int addElement(List<Integer> list, int element){
		list.add(element);
		return element;
	}
	
	//remove
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
	
	//get elements
	public int getSize(List<Integer> list) {
		return list.size();
	}
}