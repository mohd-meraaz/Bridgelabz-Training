package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FixedQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		push(queue,1,3);
		push(queue,2,3);
		push(queue,3,3);
		view(queue);
		push(queue,4,3);
		view(queue);
		push(queue,7,3);
		view(queue);
	}
	public static void push(Queue<Integer> queue, int n,int s) {
		if(queue.size()==s) {
			queue.poll();
			queue.add(n);
		}else {
			queue.add(n);
		}
	}
	public static void view(Queue<Integer> queue) {
		System.out.println("queue : "+queue);
	}
}