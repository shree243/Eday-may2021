//16. Write a Java program to shuffle the elements in a linked list. 


import java.util.*;
class LinkedList16 {
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

	Collections.shuffle(list);
	
System.out.println(list);
}
}