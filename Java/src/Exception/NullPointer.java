package Exception;

public class NullPointer {
 public static void main(String[] args) {
	 String n=null;
	 StringBuffer a = new StringBuffer("Equal");
	 try {
		 a.append(n);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
