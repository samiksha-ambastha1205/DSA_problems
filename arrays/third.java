import java.util.*;
class third
{
    static int thirdLargest(int [] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-3];
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Third Largest Element is: " + thirdLargest(arr));
    }   
}