/*
5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.
*/

class  Rectangle {
int base ;
int height;

Rectangle(int base, int height )
{
this.base= base;
this.height= height ;	
	
}
void area ()
{
	System.out.println("The area is " + (base  *  height));
}
}
class clsobj5{
	public static void main (String [] args ){
		
		Rectangle r1= new Rectangle (4 , 5 );
		Rectangle r2= new Rectangle ( 5, 8 );
		
		r1.area();
		r2.area();
		
}}
