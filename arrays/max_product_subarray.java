class max_product_subarray
 {
    static int maxProduct(int [] arr)
    {
        int n= arr.length;
        int max=arr[0];
       
        for(int i =0 ;i <n;i++)
        {
            int curr = 1;
            for(int j =i;j<n;j++)
            {
                
                curr*=arr[j];
                max=Math.max(max,curr);
            }
             // Reset current product for the next subarray
            
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
    
}
