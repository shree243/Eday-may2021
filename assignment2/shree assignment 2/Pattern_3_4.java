import java.util.*;
import java.lang.*;
class Pattern_3_4
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=9;i++)
		{
				
				for(int j=8;j>=i;j--)
				{		
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k);
				}
				for(int k=1;k<=i;k++)
				{
					int a=i-k;
					if(a!=0)
					{
					System.out.print(i-k);	
					}
					
						
					
					
				}
				System.out.println();
		}
		
	}
	
}