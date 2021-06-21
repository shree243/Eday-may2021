//9. Write a Java program to copy one array list into another.


 import java.util.*;
      public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(" ArrayList :" + li);
        ArrayList<Integer> li2 = li; 
        System.out.println("Copied ArrayList :" + li2);
        }
    }