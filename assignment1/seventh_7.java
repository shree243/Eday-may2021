	import java.util.Scanner;
	
public class seventh_7{
	public static void main (String[] args){
		
		Scanner Input= new Scanner(System.in);
System.out.println("enter the value for table");
int num=Input.nextInt();//8
for (int i= 1; i<=10; i++){
	System.out.printf("%d*%d=%d\n", num*i);