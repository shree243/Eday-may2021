import java.util.*;

class car{

Scanner scn= new Scanner(System.in);
String carname;
String carno;
String carlocation;

//method
public void insert(String a, String b,String c)
{
carname= a;
carno= b;
carlocation=c;

}
/*
public void display()
{
System.out.println(carname+ " " + carno+ " " + carlocation+ " ");
}
*/
void search (String cr)
{
	
	
	for (int i= 0;i<list.size();i++)
{
	if (cr.equals (list.get(i).car1))
	{
		System.out.println(list.get(i).carno + " " + list.get (i).carlocation);
	}	
}	
}
}

class carinfo{
public static void main (String [] args ){
Scanner sc= new Scanner (System.in);

car c1= new car();
car c2= new car();
car c3= new car();
c1.insert("wag",  "MH05AL9045" ,  "badlapur" );
c2.insert( "ino",  "MH06546" ,  "kalyan");
c3.insert( "eco",  "MH065633" , "mumbai" );

ArrayList <car> list= new ArraList<car> ();
list .add(c1);
list.add(c2);
list.add(c3);

System.out.println("Please enter the car name");
String cr= sc.next();

list.search(cr);


/*
c1.display();
c2.display();
c3.display();
*/
}}


