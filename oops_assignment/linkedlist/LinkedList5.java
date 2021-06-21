//5. Write a Java program to insert the specified element 
//at the specified position in the linked list

import java.util.*;
class LinkedList5 {
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

list.add(1, "sarang");
System.out.println("List after 1 element add on  1 position");

System.out.println(list);
}
}
