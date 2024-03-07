package CRUD_Operations;

import java.io.FileWriter;

public class Update_Or_Write {
       public static void main(String[] args) {
    	   try {
    		   FileWriter file=new FileWriter("C:\\Users\\SPURGE\\Downloads\\Sample.txt");
    		   file.write("Updated content is being written into the file");
    		   file.close();
    		   System.out.println("The content is written within the file");
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
}
