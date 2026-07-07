class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0)
            return ans;

        String[] map = {
                "",      // 0
                "",      // 1
                "abc",   // 2
                "def",   // 3
                "ghi",   // 4
                "jkl",   // 5
                "mno",   // 6
                "pqrs",  // 7
                "tuv",   // 8
                "wxyz"   // 9
        };

        solve(0, digits, new StringBuilder(), ans, map);

        return ans;
    }

    private void solve(int index, String digits, StringBuilder curr,
                       List<String> ans, String[] map) {

        // Base case
        if (index == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        // Letters corresponding to current digit
        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            curr.append(letters.charAt(i));

            // Explore
            solve(index + 1, digits, curr, ans, map);

            // Backtrack
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}