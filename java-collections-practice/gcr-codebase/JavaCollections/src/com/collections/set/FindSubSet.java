package com.collections.set;

import java.util.HashSet;

public class FindSubSet {
   public static void main(String[] args) {
	   HashSet<Integer> set = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();
       set.add(2);
       set.add(3);
       set2.add(1);
       set2.add(2);
       set2.add(3);
       set2.add(4);
       if(check(set,set2)||check(set2,set)) {
    	   System.out.println("true");
       }else {
    	   System.out.println("flase");
       }
   }
   public static boolean check(HashSet<Integer> set1, HashSet<Integer> set2) {
	   for(int i : set2) {
		   if(!set1.contains(i)) {
			  return false; 
		   }
	   }
	   return true;
   }
}