/*
2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10
After splitting :
Array 1 : 1 2 3 4
5
Array 2 : 6 7 8 9
10
*/

public class array2 {
    public static void main(String[] args) {
      
        int array[]= {1,2,3,4,5,6,7,8,9,10};
        int j=0;
int x[]= new int [array.length/2];// {0 1 2 3 4 } {1 2 3 4 5 }
int y[]= new int [array.length/2];

for (int i=0;i<array.length/2;i++)
{
     x[i]= array[i];
     System.out.println(x[i]);

}
System.out.println("***************");

for (int i=array.length/2 ;i<array.length;i++)
{
    y[j]= array[i];
System.out.println(y[j]);
j++;
}

    }
}
