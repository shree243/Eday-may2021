//6. Write a Java program to insert elements into the linked list at the first and last position.

import java.util.*;
class LinkedList6 {
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
list.addFirst( "sarang");
list.addLast( "shreepad");
System.out.println("List after adding element");
System.out.println(list);

}
}

