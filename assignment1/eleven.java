import java.util.*;
class eleven
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter R:");
	float R = sc.nextFloat();
	float PI = 3.14f;
	float Area = PI*R*R;
	float Perimeter = 2*PI*R;  
	System.out.println("Area is :"+ Area);
	System.out.println("Perimeter is:"+ Perimeter );	
	
	}
}