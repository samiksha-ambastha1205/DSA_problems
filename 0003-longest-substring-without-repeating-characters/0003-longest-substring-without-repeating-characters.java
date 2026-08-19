class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int left = 0;
        int right = 0;

        int maxLength = 0;

        while (right < n) {

            if (contains(left, right, s)) {

                left++;

            } else {

                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }

        return maxLength;
    }

    public boolean contains(int left, int right, String s) {

        for (int i = left; i < right; i++) {

            if (s.charAt(i) == s.charAt(right)) {
                return true;
            }
        }

        return false;
    }
}