package File_reading;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
//import java.util.Sc;
import java.util.Scanner;

import org.w3c.dom.css.CSS2Properties;

public class read {
	public static void main(String[] args) throws FileNotFoundException{
		HashMap<String, String> map = new HashMap<>();
   File file=new File("C:\\Users\\SPURGE\\Downloads\\input.properties");
   Scanner ob=new Scanner(file);
   Properties pro=new Properties();
   
   while(ob.hasNextLine()) {
	   String[] str1=new String[10];
	  String str=ob.nextLine();
      str1=str.split(" = ");
      map.put(str1[0], str1[1]);
   }
   System.out.println(map.get("M3BE.DB.USER"));
   System.out.println(map);
   
//   map.put("M3BE.DB.HOST", "newHost");
   map.put("M3BE.DB.USER", "newUser");
//   map.put("M3BE.DB.ENV", "newEnv");
//   map.put("M3BE.DB.DBNAME", "newDBName");
//   map.put("M3BE.DB.PWD", "newPassword");
   
   for(Map.Entry<String,String> entry:map.entrySet()) {
	   pro.setProperty(entry.getKey(), entry.getValue());
   }
   System.out.println(map);
	
   try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\SPURGE\\Downloads\\input.properties")) {
      pro.store(outputStream, null);
       System.out.println("Property file updated successfully.");
   } catch (IOException e) {
       System.err.println("Error writing to property file: " + e.getMessage());
   }
}
}