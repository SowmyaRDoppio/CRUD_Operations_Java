package Exception;

public class Array_Out_Of_Bound {
           public static void main(String[] args) {
        	   int[] array=new int[5];
        	   try {
        		   for(int i=0;i<6;i++) {
        			   array[i]=i;
        		   }
        	   }catch(Exception e) {
//        		   System.out.println(e);
//        		   e.printStackTrace();
        		   System.out.println(e.getMessage());
        	   }
           }
}
