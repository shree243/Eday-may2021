//15. Write a Java program to join two array lists.



import java.util.*;
public class ArrayList15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("1 ArrayList :" + list); 
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Six");
        list1.add("Seven");
        list1.add("Eight");
        list1.add("Nine");
        list1.add("Ten");
        System.out.println("2 ArrayList :" + list1);  
        list.addAll(list1);
        System.out.println("Joined ArrayList :" + list); 
    }
}
