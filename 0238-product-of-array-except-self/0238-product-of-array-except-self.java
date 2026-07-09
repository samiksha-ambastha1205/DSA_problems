class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        //prefix and suffix
        int n = nums.length;
        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];
        int[] ans = new int[n];
        prefixsum[0]=1;
        suffixsum[n-1]=1;
        for(int i =1;i<n;i++)
        {
            prefixsum[i]=prefixsum[i-1]*nums[i-1];
        }
        for(int i =n-2;i>=0;i--)
        {
            suffixsum[i]=suffixsum[i+1]*nums[i+1];
        }
        for(int i =0;i<n;i++)
        {
            ans[i]=prefixsum[i]*suffixsum[i];
        }
        return ans;
    }
}