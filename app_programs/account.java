import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class solution {

String acc_name;
int acc_no;
Scanner sc= new Scanner (System.in);
void open_account()
{
System.out.println("Enter the name ");
acc_name= sc.nextLine();
System.out.println("Enter the acc number ");
acc_no= sc.nextInt();
}

void showinfo()
	{

System.out.println("account holder name = " + acc_name);
System.out.println("account holder number is "+ acc_no);
	
}
/*
void deposite()
{
System.out.println("Enter the amount");
int amt= sc.nextInt();
int amount=0;
int balance=500;
amount= balance+ amt;
System.out.println("the balance is "+amount);
}

void withdraw()
{
System.out.println("Enter the amount to be withdraw");
int wt= sc.nextInt();
int total_amount=0;
int amount=0;
if (wt<=amount)
{
total_amount = amount-wt;
System.out.println("balance is " + total_amount);

}
else 
System.out.println("insufficient balance");
}

void search(String acn)
{
	if (acc_no == (acn))
	{
	showinfo();	
	}
			
}
 */
}

class account {
		public static void  main (String [] args){

		Scanner scn= new Scanner (System.in);

		System.out.println("enter the number you want to open the accout ");
		int size= scn.nextInt();
		
		solution array[]= new solution [size];

	for (int i=0;i<size;i++)
	{
		array[i]= new solution();
		array[i].open_account();
	}
	int n=0;
do {
	
System.out.println(" 1. show info \n 2. Search By Account\n 2. Deposit\n 3. Withdrawal\n 5.Exit ");

System.out.println("Enter the option you want to process ");
int option= scn.nextInt();

switch (option)
{

case 1:

System.out.println("Enter the account number");
int acn = scn.nextInt();
for (int i=0;i<array.length;i++)
{
	array[i].showinfo();
	
}
break;

case 2:

System.out.println("enter the acc number");
acn= scn.nextInt();

for (int i=0;i<array.length;i++)
{
array[i].search(acn);
}

if (!found){
System.out.println("not found ");
}

}

case 3:
System.out.println("enter the account numbe ");
acn= scn.nextInt();
for (int i=0;i<array.length;i++)
{

 array [i].search(acn);

if (found )
{
	
array [i].withdraw();
break;
}

if (!found){
System.out.println("not found ");
}
*/
}
}
//System.out.println("enter tye number to exit ");
 //n= scn.nextInt();
 while (n>0);
}


}

















































