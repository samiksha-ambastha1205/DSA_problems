class Solution {
    public List<List<String>> partition(String s) 
    {
      List<List<String>> ans = new ArrayList<>();
      solve(0,s,new ArrayList<>(),ans);
      return ans;
    }
    private void solve(int index, String s,List<String> subset, List<List<String>> ans)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        for(int end = index; end<s.length(); end++)
        {
            String part = s.substring(index,end+1);
            if(ispalindrome(part))
            {
                subset.add(part);
                solve(end+1,s,subset,ans);
                subset.remove(subset.size()-1);
            }
        }
    }
    private boolean ispalindrome(String s)
    {
        int end = s.length()-1;
        int start=0;
        while(s.charAt(start)==s.charAt(end)&&start!=s.length()-1)
        {
            start++;
            end--;
        }
        if(start==s.length()-1)
        return true;
        else
        return false;
    }
}