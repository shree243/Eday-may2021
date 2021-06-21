//10. Write a Java program to get the first and 
//last occurrence of the specified elements in a linked list.

import java.util.*;
class LinkedList10 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
list.add("first");
list.add ("second");
list.add ("third");
list.add ("fourth");
list.add("fifth");
list.add ("sixth");

System.out.println(list.getFirst());
System.out.println(list.getLast());

}
}
