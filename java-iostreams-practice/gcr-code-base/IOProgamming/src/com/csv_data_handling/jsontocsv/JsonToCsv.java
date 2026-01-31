package com.csv_data_handling.jsontocsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class JsonToCsv {
	public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("DataFiles/students.json"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("DataFiles/students.csv"));

        StringBuilder jsonText = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonText.append(line);
        }

        //JSONArray students = new JSONArray(jsonText.toString());

        // CSV header
        writer.write("ID,Name,Email,Salary");
        writer.newLine();
        reader.close();
        writer.close();

        System.out.println("JSON → CSV Done");
	}
}
