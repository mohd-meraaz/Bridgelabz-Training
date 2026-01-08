package com.stringandsorting.searching;

public class FirstPositive {
	public static void main(String[] args) {
		int [] arr = {0,-1,-2,3,-9,10};
		System.out.println(search(arr));
	}
	public static int search(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>0) {
				return i;
			}
		}
		return -1;
	}
}
