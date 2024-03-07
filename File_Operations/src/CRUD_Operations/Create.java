package CRUD_Operations;

import java.io.File;
public class Create {
           public static void main(String[] args) {
        	   try {
            	   File fileObject=new File("C:\\Users\\SPURGE\\Downloads/Sample.txt");
        		   if(fileObject.createNewFile()) {
        			   System.out.println("File"+fileObject.getName());
        		   }
        		   else {
        			   System.out.println("File already exists");
        		   }
        	   }catch(Exception e) {
        		   System.out.println("Exception Occured");
        	   }
           }
}

