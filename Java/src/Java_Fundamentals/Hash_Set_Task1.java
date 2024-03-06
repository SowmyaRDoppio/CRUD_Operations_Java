package Java_Fundamentals;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set_Task1 {
public static void main(String[] args) {
	HashSet<Integer> setit=new HashSet<>();
	setit.add(1);
	setit.add(3);
	ArrayList<Integer> list=new ArrayList<>(setit);
	list.add(1,2);
	list.add(2,6);
	System.out.println(list);
}
}
