import java.util.*;
import java.lang.*;
class Pattern_3_5
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
				for(int j=8;j>=i;j--)
				{		
					System.out.print(" ");
				}
				for(int k=10-i;k<=9;k++)
				{
					System.out.print(k);
				}
				for(int k=2;k<=i;k++)
				{
					System.out.print(10-k);
				}
				System.out.println();
		}
		
	}
	
}