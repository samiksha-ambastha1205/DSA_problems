
class third_three_loops
{
    static int thirdLargest(int [] arr)
    {
        int n= arr.length;
         int first=Integer.MIN_VALUE;
         for (int i=0;i<n;i++)
         {
            if(arr[i]>first)
            {
                first=arr[i];//got the largest
            }
         }
         int second=Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {
            if(arr[i]>second && arr[i]<first)
            {
                second=arr[i];//second largest
            }
         }
         int third= Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {
            if(arr[i]>third && arr[i]<second&&arr[i]<first)
            {
                third=arr[i];//third largest
            }
         
        }
        return third;
    }
public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Third Largest Element is: " + thirdLargest(arr));
}

}
