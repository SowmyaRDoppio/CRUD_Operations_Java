package Java_Fundamentals;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Array {
public static void main(String[] args) {
	HashMap<String,String[]> hmArray=new HashMap<>();
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the number of person");
	int n=ob.nextInt();
	String name;
	String[] favor=new String[5];
	for(int i=0;i<n;i++) {
		System.out.println("Enter your name");
		name=ob.nextLine();
		for(int j=0;j<favor.length;j++) {
			favor[j]=ob.nextLine();
		}
		hmArray.put(name, favor);
	}
		System.out.println(hmArray.get(favor[0]));
	
}
}
