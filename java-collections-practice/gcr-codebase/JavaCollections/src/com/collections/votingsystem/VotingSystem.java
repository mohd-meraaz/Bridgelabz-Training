package com.collections.votingsystem;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
   static HashMap<String,Integer> map = new HashMap<>();
   public void addCandidate(String name) {
	   name = name.toLowerCase();
	    if(map.containsKey(name)) {
	    	System.out.println("The candidate already exists");
	    	return;
	    }else {
	    	map.put(name, 0);
	    	System.out.println("The Candidate added "+name);
	    	return;
	    }
   }
   public void vote(String name,Candidate can) {
	   if(can.isVoted()) {
		   System.out.println("Voter has already voted !!");
		   return;
	   }
	   name = name.toLowerCase();
	   if(map.containsKey(name)) {
		   map.put(name,map.get(name)+1);
	   }else {
		   System.out.println("Candidate not available !!");
	   }
	   
   }
   public void result() {
	   TreeMap<String,Integer> result = new TreeMap<>(map);
	   for(Map.Entry<String, Integer>a : result.entrySet()) {
		   System.out.println("Candidate Name : "+a.getKey());
		   System.out.println("Total Votes    : "+a.getValue()+"\n");
	   }
   }
   public void view() {
	   for(var a : map.entrySet()) {
		   System.out.println("-> "+a.getKey());
	   }
   }
}