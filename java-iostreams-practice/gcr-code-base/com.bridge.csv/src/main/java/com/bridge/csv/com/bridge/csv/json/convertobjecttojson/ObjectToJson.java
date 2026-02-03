package com.json.convertobjecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	public static void main(String[] args) throws Exception{
        Car car = new Car("Toyota", "Fortuner", 3500000.5);

        
        ObjectMapper mapper = new ObjectMapper();
        
        //convert object to JSON
        String json = mapper.writeValueAsString(car);
       
        System.out.println(json);
        
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car));
	}
}
