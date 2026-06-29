class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (palindrome(sub)) {
                    if (sub.length() > maxLen) {
                        maxLen = sub.length();
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    private boolean palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
