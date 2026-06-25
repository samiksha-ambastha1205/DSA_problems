class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            Stack<Integer> st = new Stack<>();

            for (int x : nums2) {
                st.push(x);
            }

            int ans = -1;

            while (!st.isEmpty()) {

                int curr = st.pop();

                if (curr == nums1[i]) {
                    break;
                }

                if (curr > nums1[i]) {
                    ans = curr;
                }
            }

            res[i] = ans;
        }

        return res;
    }
}