//20. Write a Java program to increase the size of an array list.


import java.util.*;
public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.ensureCapacity(56); 

        System.out.println("ArrayList numbers can store upto 56 elements.");
    }
    
}
