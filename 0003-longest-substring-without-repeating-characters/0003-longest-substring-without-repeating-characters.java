

class Solution {
    public int lengthOfLongestSubstring(String s) {

       /* HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;*/
         HashMap<Character, Integer> map =  new HashMap<>();

         int left =0;
         int max=0;

         for(int right =0;right<s.length();right++)
         {
            char c  = s.charAt(right);
            if(map.containsKey(c))
            {
                left = Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            max = Math.max(max , right - left +1);
         }
         return max;





















    }
}