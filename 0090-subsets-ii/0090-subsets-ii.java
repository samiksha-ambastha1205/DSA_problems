class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtrack(0, nums, new ArrayList<>());

        return ans;
    }

    private void backtrack(int start,int[] nums,List<Integer> subset)  
     {
        if(start == nums.length)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[start]);
        backtrack(start+1,nums,subset);
        
        subset.remove(subset.size()-1);
        while( start+1<nums.length && nums[start]==nums[start+1])
        {
            start++;
        }

        backtrack(start+1,nums,subset);

     }
}
