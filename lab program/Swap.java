import java.util.Scanner;

class Swap{

public static void main(String [] args){

Scanner value = new Scanner(System.in);
System.out.println("inser the 2 value of  ");
int i= value.nextInt();
int j= value.nextInt();
int temp;
System.out.println("the value of i is "+i);
System.out.println("the value of j is "+j);

temp=i;
i=j;
j=temp;
System.out.println("the value of i is "+i);
System.out.println("the value of j is "+j);


}}
