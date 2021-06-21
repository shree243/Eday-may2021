
//7. Write a Java program to search an element in an array list.



	import java.util.*;
	public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("Three");
        list.add("Four");
        list.add("five");
        list.add("six");
        System.out.println(list);
		Scanner sc= new Scanner (System.in);
		
		Sytem.out.println("enter the word to find");
		String word= sc.nextInt();
		
        Boolean b = list.contains("Four");
        if (b){
            System.out.println("Contains the element searched.");
        }
        else{
            System.out.println("did not searched element ");
        }
        
    }
}
