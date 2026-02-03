package com.json.readjson;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
	public static void main(String[] args) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode node = mapper.readTree(new File("DataFiles/stduent.json"));
		
		System.out.println(node.get("name").asText());
		System.out.println(node.get("salary").asText());
		
	}
}
