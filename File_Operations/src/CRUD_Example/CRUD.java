package CRUD_Example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CRUD {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader("C:\\Users\\SPURGE\\Downloads\\input.properties");
            properties.load(reader);
            reader.close();

            // Get the value of the key
            String oldValue = properties.getProperty("M3BE.DB.DBNAME");
            System.out.println("Old value of the key: " + oldValue);

            // Set the new value for the key
            properties.setProperty("M3BE.DB.DBNAME", "DBNAME");

            // Write the updated properties back to the file
            FileWriter writer = new FileWriter("C:\\Users\\SPURGE\\Downloads\\input.properties");
            properties.store(writer, "Updated value");
            writer.close();

            System.out.println("Property file updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
