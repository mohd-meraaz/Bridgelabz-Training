package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			queue.add(Integer.toBinaryString(i));
		}
		System.out.println("Queue : "+queue);
	}
}