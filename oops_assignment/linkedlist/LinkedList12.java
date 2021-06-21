//12. Write a Java program to remove a specified element from a linked list.


import java.util.*;
class LinkedList12 {
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
list.remove(2);
	System.out.println(list);
	

}
}