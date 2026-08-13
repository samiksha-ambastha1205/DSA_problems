class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();

        for (int num : asteroids) {

            boolean alive = true;

            while (alive && !s.isEmpty() && s.peek() > 0 && num < 0) {
                if (s.peek() < Math.abs(num)) {
                    s.pop();
                }

                else if (s.peek() == Math.abs(num)) {
                    s.pop();
                    alive = false;
                }

                else {
                    alive = false;
                }
            }

            if (alive) {
                s.push(num);
            }
        }

        int[] result = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            result[i] = s.pop();
        }

        return result;
    }
}