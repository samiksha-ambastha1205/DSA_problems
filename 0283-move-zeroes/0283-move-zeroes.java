class Solution {
    public void moveZeroes(int[] nums) 
    {
        /*int n= nums.length;
        int[] temp = new int[n];
        int p=0;
        for(int i =0 ;i<n;i++)
        {
            if(nums[i]!=0)
            {
                temp[p]=nums[i];
                p++;
            }
            
        }
        for(int j =p;j<n;j++)
        {
            temp[j]=0;
        }
        for(int i =0;i<n;i++)
        {
            nums[i]=temp[i];
        }*/
        int n = nums.length;
        for(int i =0;i<n;i++)
        {
            if(nums[i]==0)
            {
                int count=i;
                while(count<nums.length&&nums[count]==0)
                {
                  count++;
                }
                if(count<nums.length)
                swap(count,i,nums);
            }
        }
        
    }
    private void swap(int count,int i,int[] nums)
    {
        int temp = nums[i];
        nums[i]=nums[count];
        nums[count]=temp;
    }
}