package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Before reverse : "+queue);
		System.out.println("After  reverse : "+reverse(queue));
		
	}
	public static Queue<Integer> reverse(Queue<Integer> queue){
		Stack<Integer> stack = new Stack<>();
		while(!queue.isEmpty()) {
			stack.add(queue.poll());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		return queue;
	}
}
