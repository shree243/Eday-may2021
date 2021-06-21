//19. Write a Java program to trim the capacity of an array list the current list size.




import java.util.*;
public class ArrayList19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.trimToSize(); 

        for (int li: list){
            System.out.println("numbers :" + li);
        }
        }
    }
    
