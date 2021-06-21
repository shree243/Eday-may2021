/*
3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.
*/

class Triangle
{
	int base;
	int height;
	int side;
	
	Triangle()
	{
		this.base=3;
		this.height=4;
		this.side=5;
	}
	
	void result()
	{
		
		System.out.println("the area is " + (base * height) / 2 );
		System.out.println("the perimeter is  " + (base + height + side) );
		
	}	
}

class clsobj3{
public static void main (String args []){
	
	Triangle s1= new Triangle ();
	s1.result();
	
	
}}
