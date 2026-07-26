class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result; 
    }
    public void backtrack(String s , int start , List<String> current, List<List<String>> result)
    {
        //we reached end 
        if(start==s.length())
        {
            result.add(new ArrayList<>(current));
            return;
        }
        //try every possible substrings
        for(int end = start;end<s.length();end++)
        {
            String subpart = s.substring(start,end+1);
            //choose only those substring that is palindrome 
            if(isPalindrome(subpart))
            {
                //add into current 
                current.add(subpart);
                //go deeper
                backtrack(s,end+1,current,result);
                //backtrack
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome (String s)
    {
        int n = s.length();
        int i =0;
        while(i!=n/2)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))

            return false;
            i++;
        }
        return true;
    }
}