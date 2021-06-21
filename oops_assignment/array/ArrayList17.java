//17. Write a Java program to empty an array list.


import java.util.*;
public class ArrayList17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println(list); 
        list.clear(); 
        System.out.println(list);
    }
}
