//17. Write a Java program to join two linked lists.


import java.util.*;
class LinkedList17 {
public static void main (String [] args){

LinkedList <String > list = new LinkedList<String > ();
  list.add("Red");
          list.add("Green");
          list.add("Black");
          list.add("White");
          list.add("Pink");
          System.out.println("List of first linked list: " + list);
         LinkedList <String> list1 = new LinkedList <String> ();
          list1.add("Red");
          list1.add("Green");
          list1.add("Black");
          list1.add("Pink");
          System.out.println("List of second linked list: " + list1);
        
      // Let join above two list
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(list);
        a.addAll(list1);
        System.out.println("New linked list: " + a);
}
}

