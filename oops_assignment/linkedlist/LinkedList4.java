//4. Write a Java program to iterate a linked list in reverse order. 


import java.util.*;
class LinkedList4 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
list.add("first");
list.add ("second");
list.add ("third");
list.add ("fourth");
list.add("fifth");
list.add ("sixth");

Iterator <String> itr = list.descendingIterator();
while (itr.hasNext()){
System.out.println("The list is "+ itr.next());
}
}
}




