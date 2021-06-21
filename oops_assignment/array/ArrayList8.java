//8. Write a Java program to sort a given array list.


import java.util.*;
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        System.out.println("Before sorting ArrayList :" + list1);
        Collections.sort(list1);
        System.out.println("After sorting in ascending order :" + list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("After sorting in Descending order :" + list1);

    }
}