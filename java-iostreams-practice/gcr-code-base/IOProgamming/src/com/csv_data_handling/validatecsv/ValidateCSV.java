package com.csv_data_handling.validatecsv;
import java.io.*;

public class ValidateCSV {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/data.csv")));
			String line = reader.readLine();
			String emailRegex = "^[a-z0-9._+-]+@[a-z0-9.-_+=]+\\.[a-z]{2,}$";
			String phoneRegex = "^[0-9]{10}$";
			
			while((line=reader.readLine())!=null) {
				String data[] = line.split(",");
				System.out.println("-----------------------");
				if(data[0].trim().matches(emailRegex)) {
					System.out.println("Email valid");
				}else {
					System.out.println("Email not valid!");
				}
				if(data[1].trim().matches(phoneRegex)) {
					System.out.println("Phone number valid");
				}else {
					System.out.println("Phone number not valid!");
				}
				System.out.println(data[0].trim());
				System.out.println(data[1].trim());
				System.out.println("-----------------------");
			}
			reader.close();
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
