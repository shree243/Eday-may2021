/*
3. Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5
*/

public class array3 {
    public static void main(String[] args) {
        int array []= {1,2,3,4,5};
        for(int j=0;j<array.length;j++)
        {   
        int temp = array[array.length-1];
        
    for (int i=array.length-2;i>=0;i--)
    {
        array[i+1]=array[i];
    }
    array[0]= temp;
for (int z: array){
System.out.print(z+ " ");
}

    System.out.println();
        }
    }
}
