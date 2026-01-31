package com.csv_data_handling.largecsvread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {

	 private static final int BATCH_SIZE = 100;

	    public static void main(String[] args) {

	        int totalRecords = 0;
	        List<String> batch = new ArrayList<>(BATCH_SIZE);

	        try (BufferedReader reader = new BufferedReader(
	                new FileReader("DataFiles/large_employee.csv"))) {

	            String line;

	            // skip header
	            reader.readLine();

	            while ((line = reader.readLine()) != null) {

	                batch.add(line);

	                if (batch.size() == BATCH_SIZE) {
	                    processBatch(batch);
	                    totalRecords += batch.size();
	                    System.out.println("Processed records: " + totalRecords);
	                    batch.clear(); // VERY IMPORTANT
	                }
	            }

	            // here process remaining lines (<100)
	            if (!batch.isEmpty()) {
	                processBatch(batch);
	                totalRecords += batch.size();
	                System.out.println("Processed records: " + totalRecords);
	            }

	            System.out.println("✅ Finished processing file!");

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    private static void processBatch(List<String> batch) {
	        for (String record : batch) {
	        	String[] columns = record.split(",");
	        }
	    }
}
