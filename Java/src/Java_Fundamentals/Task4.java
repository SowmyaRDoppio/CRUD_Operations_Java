package Java_Fundamentals;

import java.util.ArrayList;

public class Task4 {
 public static void main(String[] args) {
	 ArrayList<Integer> list3=new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(1);
		list3.add(2);
		list3.add(0);
		int temp;
		for(int i=0;i<list3.size();i++) {
			for(int j=i+1;j<list3.size();j++) {
				if(list3.get(i)>list3.get(j)) {
					temp=list3.get(i);
					list3.set(i,list3.get(j));
					list3.set(j,temp);
				}
			}
		}
		System.out.println(list3);
 }
}
