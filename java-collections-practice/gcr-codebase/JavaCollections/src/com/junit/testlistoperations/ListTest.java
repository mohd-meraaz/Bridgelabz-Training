package com.junit.testlistoperations;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class ListTest {
		
	@Test
	void testAddElement() {
		ListManager listManager = new ListManager();
		List<Integer> values = new ArrayList<>();
		assertEquals(20,listManager.addElement(values, 20));
	}
	
	@Test
	void testRemoveElement() {
		ListManager listManager = new ListManager();
		List<Integer> values = new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(0);
		assertFalse(listManager.removeElement(values, (200)));
	}
	
	@Test
	void testgetsize() {
		ListManager listManager = new ListManager();
		List<Integer> values = new ArrayList<>();
		values.add(20);
		values.add(20);
		values.add(20);
		assertEquals(3,listManager.getSize(values));
	}

}
