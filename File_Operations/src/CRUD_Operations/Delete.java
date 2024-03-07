package CRUD_Operations;

import java.io.File;

	public class Delete {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\SPURGE\\Downloads\\Sample.txt");
		if(file.delete()) {
			System.out.println(file.getName()+ " is been deleted");
		}else {
			System.out.println("404!");
		}
	}
	
}
