package Java_Fundamentals;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
    	ArrayList<Integer> list2=new ArrayList<>();
    	list2.add(1);
    	list2.add(3);
    	list2.add(2);
    	list2.add(3);
    	ArrayList<Integer> newList=new ArrayList<>();
    	
    	for( int i:list2) {
    		if(!newList.contains(i)) {
    			newList.add(i);
    		}
    	}
    	System.out.println(newList);
    }
}
