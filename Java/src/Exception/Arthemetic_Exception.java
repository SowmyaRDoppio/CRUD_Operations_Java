package Exception;

public class Arthemetic_Exception {
      public static void main(String[] args) {
    	  int i=10;
    	  try {
    		  System.out.println(i/0);
    	  }
    	  catch(Exception e) {
    		  System.out.println("It's an error");  
    	  }
      }
}
