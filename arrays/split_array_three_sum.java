class split_array_three_sum 
{
    static int findSum(int [] arr, int start , int end)

    {
        int sum=0;
        for(int i=start; i<=end;i++)
        {
            sum+=arr[i];
           
        }
         return sum;
    }
    static int [] findSplit(int [] arr)
    {
        int n=arr.length;

        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                int sum1 = findSum(arr ,0,i);
                int sum2 = findSum(arr, i+1, j);
                int sum3 = findSum(arr, j+1, n-1);

                if(sum1==sum2&&sum2==sum3&&sum3==sum1)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        int [] arr={1,3,4,0,4};
        int [] result = findSplit(arr);
        
        
            System.out.println(result[0] + " " + result[1]);
        
        
            }
    
}
