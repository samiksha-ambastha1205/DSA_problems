class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        long MOD = 1000000007L;

        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                prevSmaller[i] = -1;
            else
                prevSmaller[i] = stack.peek();

            stack.push(i);
        }

        stack.clear();

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                nextSmaller[i] = n;
            else
                nextSmaller[i] = stack.peek();

            stack.push(i);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {

            long left = i - prevSmaller[i];
            long right = nextSmaller[i] - i;

            ans = (ans + (left * right * arr[i]) % MOD) % MOD;
        }

        return (int) ans;
    }
}