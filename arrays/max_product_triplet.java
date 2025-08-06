class max_product_triplet
{
    static int maxproduct(int [] arr)
    {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                  if(arr[i]*arr[j]*arr[k]>max)
                  {
                    max=arr[i]*arr[j]*arr[k];
                  }
                }
            }
        }
        return max;
    }
    public static void main (String[] args)
    {
        int [] arr = {-10, -3, -5, -6, -20};
        System.out.println("Maximum product of triplet is: " + maxproduct(arr));
    }
}
