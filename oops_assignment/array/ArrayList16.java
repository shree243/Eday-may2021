//16. Write a Java program to clone an array list to another array list.




import java.util.*;
public class ArrayList16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("Original ArrayList :" + list);        
        ArrayList list1 = new ArrayList();
        list1 = (ArrayList)list.clone();
        System.out.println("Clonned ArrayList :" + list1); 
        }
}
