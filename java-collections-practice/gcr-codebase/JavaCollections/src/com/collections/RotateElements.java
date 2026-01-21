package com.collections;

import java.util.ArrayList;

public class RotateElements {
	public static void main(String[]args) {
		 ArrayList<Integer> arr = new ArrayList<>();
		 arr.add(10);
		 arr.add(20);
		 arr.add(30);
		 arr.add(40);
		 arr.add(50);
		 System.out.println("list before rotation : "+arr);
		 rotated(arr,2);
		 System.out.println("list after rotation : "+arr);
	 }
	 public static void rotated(ArrayList<Integer> arr, int k ) {
		 for(int i = 0;i<=k;i++) {
			 for(int j =0;j<arr.size();j++) {
				 Integer temp = arr.get(arr.size()-1);
				 arr.set(arr.size()-1,arr.get(j));
				 arr.set(j,temp);
			 }
		 }
	 }
}
