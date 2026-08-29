class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;

        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (ch == 'a') {
                lastA = right;
            } else if (ch == 'b') {
                lastB = right;
            } else {
                lastC = right;
            }

            int minLast = Math.min(lastA, Math.min(lastB, lastC));

            if (minLast != -1) {
                ans += minLast + 1;
            }
        }

        return ans;
    }
}