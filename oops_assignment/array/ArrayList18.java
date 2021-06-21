//18. Write a Java program to test if an array list is empty or not.




import java.util.*;
public class ArrayList18 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Boolean ans = list.isEmpty();
        if (ans == true){
            System.out.println("Arraylist is empty");
        }
        else {
            System.out.println("Arraylist is not empty");
        }
        list.add(1);
        list.add(3);
        Boolean ans1 = list.isEmpty();
        if (ans1 == true){
            System.out.println("Arraylist is empty");
        }
        else {
            System.out.println("Arraylist is not empty");
        }
    }
}