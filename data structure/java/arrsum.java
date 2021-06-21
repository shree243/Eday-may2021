public class arrsum {
    public static void main(String[] args) {

        int arr[]={0,1,5,9,7,1,2,3,6,4};
int sum=0;
            for (int i=0;i<arr.length-1;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println(sum);
    }
}
