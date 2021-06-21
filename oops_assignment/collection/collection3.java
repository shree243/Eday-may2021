import java.util.*;
class collection3{
	public static void main (String [] args){
		ArrayList<String> list= new ArrayList<String >();
		
		list.add("11");
		list.add("13");
		list.add("14");
		list.add("15");
		list.add("16");
		list.add(1,"12");
		Iterator itr = list.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
}}
