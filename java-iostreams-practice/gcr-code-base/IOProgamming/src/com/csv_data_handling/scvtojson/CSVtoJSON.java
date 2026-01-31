package com.csv_data_handling.scvtojson;

import java.io.*;

public class CSVtoJSON {

    public static void main(String[] args) {

        String csvFile = "DataFiles/students.csv";
        String jsonFile = "DataFiles/students_new.json";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(jsonFile))
        ) {

            String headerLine = reader.readLine(); // read header
            if (headerLine == null) {
                System.out.println("CSV is empty");
                return;
            }

            String[] headers = headerLine.split(",");

            writer.write("[\n"); // start JSON array

            String line;
            boolean firstRecord = true;

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");

                if (!firstRecord) {
                    writer.write(",\n");
                }

                writer.write("  {\n");

                for (int i = 0; i < headers.length; i++) {
                    writer.write("    \"" + headers[i] + "\": \"" + values[i] + "\"");
                    if (i < headers.length - 1) {
                        writer.write(",");
                    }
                    writer.write("\n");
                }

                writer.write("  }");
                firstRecord = false;
            }

            writer.write("\n]");
            System.out.println("✅ CSV → JSON Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
