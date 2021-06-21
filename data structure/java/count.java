import java.util.*;
public class count {
 public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
int arr[]= new int[8];

    System.out.println("enter the number to add in array");
   
    for (int i=0;i<arr.length;i++)
 {
        arr[i]= sc.nextInt();
 }
System.out.println("enter the element u want to find ");
int b= sc.nextInt();
int count=0;
 for (int i=0;i<arr.length;i++)
 {

    if (arr[i]==b)
    count++;
 }
System.out.println("count is " + count);
 }   
}