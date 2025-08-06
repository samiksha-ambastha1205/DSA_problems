import java.util.*;
class max_triplet_sort
{
    public static int maxTripletSort(int [] arr)
    {
        int n =arr.length;
        Arrays.sort(arr);
        int max= Math.max(arr[0]*arr[1]*arr[n-1] , arr[n-3]*arr[n-2]*arr[n-1]);
        return max;
    }
    public static void main (String[] args)
    {
        int [] arr = {-10, -3, -5, -6, -20};
        System.out.println("Maximum product of triplet is: " + maxTripletSort(arr));
    }
    
}