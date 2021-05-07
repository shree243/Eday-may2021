import java.util.*;
class avg
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st Num ");
	int a = sc.nextInt();
	System.out.print("Enter 2 Num ");	
	int b = sc.nextInt();
	System.out.print("Enter 3 Num ");	
	int c = sc.nextInt();
	int d = (a+b+c)/3;
	System.out.println("Avg:" + d);
	}
}
