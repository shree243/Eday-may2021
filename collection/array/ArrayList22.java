//22. Write a Java program to print all the elements of an ArrayList using the position of the elements.




import java.util.*;
public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
   
        System.out.println(list); 
        int li = list.size();
        for(int i = 0; i<li;i++){
             System.out.println(list.get(i)); 
        }
        
    }
}