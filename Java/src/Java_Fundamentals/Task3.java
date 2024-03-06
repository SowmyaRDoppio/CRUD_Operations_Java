package Java_Fundamentals;

import java.util.ArrayList;

public class Task3 {
public static void main(String[] args) {
	ArrayList<Integer> list3=new ArrayList<>();
	list3.add(1);
	list3.add(2);
	list3.add(3);
	list3.add(4);
	list3.add(5);
	int[] array=new int[list3.size()];
	int index=0;
	for(int i:list3) {
		array[index]=i;
		index++;
	}
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
}
