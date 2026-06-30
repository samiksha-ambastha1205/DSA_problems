class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs==null || strs.length ==0)
        {
            return "";
        }
        String first = strs[0];
        for(int i =1;i<strs.length;i++)
        {
            first = compare(first, strs[i]);
        }
      return first;  
    }
    private String compare(String first, String second)
    {
        int length= Math.min(first.length(), second.length());
     int i =0;
     int save=0;
     while(i<length && first.charAt(i)==second.charAt(i))
     {
        save++;
        i++;
     }
     return first.substring(0,save);
    }
}