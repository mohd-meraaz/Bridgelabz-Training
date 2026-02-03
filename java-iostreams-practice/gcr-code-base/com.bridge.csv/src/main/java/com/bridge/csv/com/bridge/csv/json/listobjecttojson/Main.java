package com.json.listobjecttojson;


import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
        Car car1 = new Car("Toyota", "Fortuner", 3500000.5);
        Car car2 = new Car("BMW", "BMW", 9913500000.5);
        Car car3 = new Car("LAND LOVER", "TATA", 83500000.5);
        
        
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        
        
        ObjectMapper mapper = new ObjectMapper();  
        
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(carList);
        System.out.println(json);
        mapper.writeValue(new File("DataFiles/listObj.json"), carList);
	}
}