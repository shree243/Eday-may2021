//12. Write a Java program to extract a portion of an array list.



import java.util.*;
public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(" ArrayList :" + list);
        List<Integer> list2 = list.subList(1 , 3);
        System.out.println(" ArrayList :" + list2);
        }
    }
	