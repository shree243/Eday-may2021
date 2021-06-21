//7. Write a Java program to insert the specified element at the
//front of a linked list. 
import java.util.*;
class LinkedList7 {
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
list.offerFirst( "sarang");
System.out.println("List after adding element");
System.out.println(list);

}
}

