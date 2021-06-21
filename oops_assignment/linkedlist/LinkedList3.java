//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.*;
class LinkedList3 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
list.add("first");
list.add ("second");
list.add ("third");
list.add ("fourth");
list.add("fifth");
list.add ("sixth");

Iterator itr= list.listIterator(2);
while (itr.hasNext()){
System.out.println("The list is "+ itr.next());
}
}
}



