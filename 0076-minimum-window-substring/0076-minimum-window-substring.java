class Solution {
    public String minWindow(String s, String t) {

        // Store how many times each character is needed
        int[] need = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        // Store characters currently inside our window
        int[] window = new int[128];

        // Number of different characters we need
        int required = 0;

        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) {
                required++;
            }
        }

        int formed = 0;

        int left = 0;

        // Store the smallest window found
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        // Expand the window using right
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            window[c]++;

            // If we have exactly enough of this required character
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }

            // If window contains all required characters
            while (formed == required) {

                // Check if current window is smaller
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);
                window[leftChar]--;

                // If removing it makes the window invalid
                if (need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        // No valid window found
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        // Return smallest window
        return s.substring(start, start + minLength);
    }
}