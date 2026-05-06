package com.streams.filehandling.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SaveRetrieveObjectApp {
private static final String FILE_PATH = "textFiles/employee.txt";
	
	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) throws Exception{
		
		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			Employee ravi = new Employee(101,"Ravi","IT",25000);
			Employee amit = new Employee(102,"Amit","HR",43244);
			
			List<Employee> list = new ArrayList<>();
			
			list.add(ravi);
			list.add(amit);
			
			obj.writeObject(list);
			System.out.println("Added employee object into file.");
		}
		
		//read data
		try (ObjectInputStream read = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			List<Employee> readEmployee = (List<Employee>) read.readObject();
			
			for(Employee e : readEmployee) {
				System.out.println(e.toString());
			}
		}
	}
}
