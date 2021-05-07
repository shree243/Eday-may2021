import java.util.*;
class Rec
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Height:");
	float H = sc.nextFloat();
	System.out.print("Enter Width:");	
	float W = sc.nextFloat();
	float Area = H*W; 
	System.out.println("Area: + H + "*" + W + "=" + Area);	
	float Perimeter = 2*(H+W); 
	System.out.println("Perimeter is : 2*(" + H + W + ")=" + Perimeter );	
	
	}
}