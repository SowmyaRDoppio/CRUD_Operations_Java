package Java_Fundamentals;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {
    	ArrayList<String> list=new ArrayList<>();
    	list.add("Sowmya");
    	list.add("Ruchi");
    	list.add("Sowmya");
    	System.out.println(list);
//    	list.add(0,"SOwmya R");
//    	list.remove(1);
    	Collections.replaceAll(list,"Sowmya","Doppio");
    	System.out.println(list);
    
    }
}
