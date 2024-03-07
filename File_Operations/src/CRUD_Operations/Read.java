package CRUD_Operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
public static void main(String[] args) {
	File file=new File("C:\\Users\\SPURGE\\Downloads\\Sample.txt");
	try {
		Scanner ob=new Scanner(file);
		while(ob.hasNextLine()) {
			String filedata=ob.nextLine();
			System.out.println(filedata);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

