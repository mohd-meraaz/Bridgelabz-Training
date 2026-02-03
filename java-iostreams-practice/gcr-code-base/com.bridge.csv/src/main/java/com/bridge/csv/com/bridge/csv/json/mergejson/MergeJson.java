package com.bridge.csv.com.bridge.csv.json.mergejson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;


public class MergeJson {
	public static void main(String[] args) throws Exception{
		File file1 = new File("DataFiles/student.json");
		File file2 = new File("DataFiles/stduent2.json");
		
		ObjectMapper map = new ObjectMapper();
		
		ArrayNode array = (ArrayNode) map.readTree(file1);
		ArrayNode array2 = (ArrayNode) map.readTree(file2);
		
		array.addAll(array2);
		
		System.out.println(array.toPrettyString());
	}
}
