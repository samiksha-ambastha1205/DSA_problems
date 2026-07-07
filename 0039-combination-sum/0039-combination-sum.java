class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, candidates, target, new ArrayList<>());

        return ans;
    }

    private void backtrack(int index,
                           int[] candidates,
                           int target,
                           List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Take current number
        curr.add(candidates[index]);
        backtrack(index,
                  candidates,
                  target - candidates[index],
                  curr);

        //backtrack
        curr.remove(curr.size() - 1);

        // Skip current number
        backtrack(index + 1,
                  candidates,
                  target,
                  curr);
    }
}