
class max_product_subarray_greedy 
{
    static int max(int a,int b, int c)
    {return Math.max(a,Math.max(b,c));

    }
    static int min(int a,int b, int c)
    {return Math.min(a,Math.min(b,c));

    }
    static int maxProduct(int [] arr)
    {
        int n=arr.length;
        int curMax=arr[0];
        int curMin= arr[0];
        int max=arr[0];
        for(int i=1 ;i<n;i++)
        {
            int temp = max(arr[i], arr[i]*curMax,arr[i]*curMin);
            curMin= min(arr[i],arr[i]*curMax,arr[i]*curMin);
            curMax=temp;
            max=Math.max(max,curMax);

        }
        return max;

    }
    public static void main(String args[])
    {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
    
}
