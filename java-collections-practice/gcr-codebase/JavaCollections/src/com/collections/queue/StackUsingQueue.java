package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	static Queue<Integer> queue = new LinkedList<>();
   public static void main(String[] args) {
	  push(10);
	  push(9);
	  push(8);
	  view();
	  pop();
	  view();
   }
   public static boolean push(int n) {
	   queue.add(n);
	   return true;
   }
   public static int pop() {
	   Queue<Integer> temp = new LinkedList<>();
	   Integer x = null;
	   while(!queue.isEmpty()) {
		   if(queue.size()==1) {
			   x = queue.poll();
			   break;
			 }
		   temp.add(queue.poll());
		   
	   }
	   while(!temp.isEmpty()) {
		   queue.add(temp.poll());
	   }
	   return x==null ? -1 : x;
   }
   public static void view() {
	   System.out.println("Stack : "+queue);
   }
}