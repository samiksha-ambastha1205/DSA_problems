class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        solve (0,nums,new ArrayList<>(), k, n, ans);
        return ans;
    }
    private void solve(int index, int [] nums, List<Integer> subset ,int k,int n, List<List<Integer>> ans)
    {
        if((subset.size()==k && sum(subset)== n) )
        {
            ans.add(new ArrayList<>(subset));
            return;
        }

        if(index==nums.length)
        {
            return;
        }
        
        subset.add(nums[index]);
        solve(index+1,nums,subset,k,n,ans);

        subset.remove(subset.size()-1);

        solve(index+1,nums,subset,k,n,ans);
    }
    private int sum(List<Integer> subset)
    {
        int n = subset.size();
        int sum =0;
        for(int i =0;i<n;i++)
        {
            sum+=subset.get(i);
        }
        return sum;
    }
}