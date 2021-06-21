//10. Write a Java program to shuffle elements in an array list.


import java.util.*;
public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    
        System.out.println(" Before shuffling elements :" + list);
        Collections.shuffle(list); 
        System.out.println(" After shuffling elements :" + list);
    }
    
}
