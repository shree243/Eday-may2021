//11. Write a Java program to display the elements and their positions in a linked list. 


import java.util.*;
class LinkedList11 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
list.add("first");
list.add ("second");
list.add ("third");
list.add ("fourth");
list.add("fifth");
list.add ("sixth");

for (int i=0;i<list.size();i++)
{
	System.out.println("Element at index " + i + "="+ list.get(i));
	
	
}

}
}





