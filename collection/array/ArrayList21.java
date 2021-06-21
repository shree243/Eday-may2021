//21. Write a Java program to replace the second element of an ArrayList with the specified element.



import java.util.*;
class ArrayList21{
   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>(); 
      list.add("white");
      list.add("Blue");
      list.add("yellow");
      list.add("orange");
      list.add("Black");
      list.add("violet");
      System.out.println("ArrayList before replacing :" + list);
      list.set(2, "green"); 
      System.out.println("ArrayList after replacing :" + list);
   }
}
