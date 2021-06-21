// 15. Write a Java program of swap two elements in a linked list.



import java.util.*;
class LinkedList15 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
list.add("first");
list.add ("second");
list.add ("third");
list.add ("fourth");
list.add("fifth");
list.add ("sixth");

System.out.println("original list");
System.out.println(list);

	Collections.swap(list,0,2);
	
System.out.println(list);
}
}