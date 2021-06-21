import java.util.*;
class collection{
	public static void main (String [] args ){
		ArrayList <String > list= new ArrayList <String >();
		list.add("Black");
		list.add("White");
		list.add("Orange");
		list.add("Blue");
		list.add("Yellow");
		Iterator itr= list.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
}}
