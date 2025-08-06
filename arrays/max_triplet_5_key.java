class max_triplet_5_key 
{
    public static int maxProduct(int[] arr)
    {
        int n = arr.length;
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int max3= Integer.MIN_VALUE;
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3)
            {
                max3=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);

    }
    public static void main(String[] args)
    {
        int [] arr = {-10, -3, -5, -6, -20};
        System.out.println("Maximum product of triplet is: " + maxProduct(arr));
    }
}
