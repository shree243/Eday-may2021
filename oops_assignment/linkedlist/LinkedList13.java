//13. Write a Java program to remove the first and last element from a linked list.


import java.util.*;
class LinkedList13 {
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

	System.out.println(list.removeFirst());
	
	System.out.println(list.removeLast());
	
System.out.println(list);
}
}