//14. Write a Java program of swap two elements in an array list.


import java.util.*;
public class ArrayList14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
            list.add("one");
            list.add("two");
            list.add("Three");
            list.add("Four");
            list.add("five");
            list.add("Six");
            System.out.println("Before Swapping the elements :" + list);
            Collections.swap(list, 1, 4); 
            System.out.println("After Swapping the elements :" + list);
    }
}