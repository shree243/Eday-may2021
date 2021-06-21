/*
6.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are
entered through keyboard.
*/
import java.util.*;


class area {
	Scanner sc=new Scanner (System.in);
	
	int base;
	int height;
	
	void setDIM()
	{
	System.out.println("Please enter dimension of a base of a rectangle ");
	this.base = sc.nextInt();
	
	System.out.println("Please enter dimension of a height of a rectangle ");
	this.height = sc.nextInt();	
		
	}
	
	void getAREA()
	{
		
	System.out.println("The area is " + (base * height));	
	}	
}

class clsobj6{
	public static void main (String args [])
	{
		
		area a1= new area ();
		a1.setDIM();
		a1.getAREA();
		
		
}}