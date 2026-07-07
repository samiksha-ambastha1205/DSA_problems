class Solution {

    public List<List<Integer>> combinationSum2(int[] nums, int target) 
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans,target);
        return ans;
    }
    private void solve(int index , int [] nums , List<Integer> subset , List<List<Integer>> ans , int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        if(target<0 || index ==nums.length)
        {
            return;
        }
        //take 
        subset.add(nums[index]);
        solve(index+1,nums,subset,ans,target-nums[index]);

        //backtrack
        subset.remove(subset.size()-1);

        //dont take 
        while(index + 1 < nums.length && nums[index] == nums[index + 1])
        {
            index++;
        }
        solve(index+1,nums,subset,ans,target);
    }
}