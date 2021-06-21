//11. Write a Java program to reverse elements in an array list.



  import java.util.*;
class ArrayList11{
   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>(); 
      list.add("white");
      list.add("blue");
      list.add("yellow");
      list.add("green");
      list.add("purple");
      list.add("black");
      System.out.println(" before reversing :" + list);
      Collections.reverse(list); 
      System.out.println(" after reversing :" + list);
   }
}