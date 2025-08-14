import java.util.*;
public class minimize_max_height_sort 
{
    static int getMinHeight(int [] arr , int k)
    {
        int n=arr.length;
        Arrays.sort(arr);

        int res =arr[n-1] -arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] - k < 0)
            {
                continue;
            }
            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[i-1] + k, arr[n-1] - k);
            res = Math.min(res, max - min);
        }
        return res;




    }
    public static void main(String[] args) {
        int [] arr = {12, 6, 4, 15, 17, 10};
        int k = 6;
        System.out.println(getMinHeight(arr, k));
    }
    
}
