class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> s = new Stack<>();

        int max = 0;

        for (int i = 0; i <= heights.length; i++) {

            int current = (i == heights.length)
                    ? 0
                    : heights[i];

            while (!s.isEmpty() && heights[s.peek()] > current) {

                int index = s.pop();

                int height = heights[index];

                int width;

                if (s.isEmpty()) {
                    width = i;
                } else {
                    width = i - s.peek() - 1;
                }

                int area = height * width;

                max = Math.max(max, area);
            }

            s.push(i);
        }

        return max;
    }
}