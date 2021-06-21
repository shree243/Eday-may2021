/* 4. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with constructor having the three sides as its parameters.
*/

class Triangle {
	
	
	int base;
	int side;
	int height ;
	
	Triangle (int base, int height , int side )
	{
		this.base= base;
		this.height = height ;
		this.side= side;
		
	}
	
	void result ()
	{
		
		System.out.println("the area is " + (base * height ) / 2);
		System.out.println("the perimeter is " + (base + height + side));	
	}
	
}
class clsobj4{
	public static void main (String [] args ){
		
		Triangle t1= new Triangle (3 , 4 , 5 );
		t1.result();
		
		
}}
