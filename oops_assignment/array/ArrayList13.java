//13. Write a Java program to compare two array lists.



import java.util.*;
public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4"); 
        System.out.println("1 ArrayList :" + list); 
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hello");
        list2.add("hello1");
        list2.add("hello2");
        list2.add("hello3");
        list2.add("helllo4");  
        System.out.println("2 ArrayList :" + list2); 
      
        if(list.equals(list2) == true){ 
            System.out.println("Both the list's are same");
        }
        else {
            System.out.println("Both the list's are not same");
        }
        }
    }