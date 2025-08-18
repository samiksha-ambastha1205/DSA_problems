import java.util.Arrays;

class sort_equation_two_pointer {

    public static int evaluate(int x, int A, int B, int C) {
        return A*x*x + B*x + C;
    }

    static int[] sortArray(int[] arr, int A, int B, int C) {
        int n = arr.length;
        int[] sorted = new int[n];
        int left = 0, right = n - 1;
        int index = (A >= 0) ? n - 1 : 0;

        while (left <= right) {
            int leftval = evaluate(arr[left], A, B, C);
            int rightval = evaluate(arr[right], A, B, C);

            if (A >= 0) {
                if (leftval > rightval) {
                    sorted[index--] = leftval;
                    left++;
                } else {
                    sorted[index--] = rightval;
                    right--;
                }
            } else {
                if (leftval < rightval) {
                    sorted[index++] = leftval;
                    left++;
                } else {
                    sorted[index++] = rightval;
                    right--;
                }
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 2, 4};
        int A = 1, B = 3, C = 5;
        int[] result = sortArray(arr, A, B, C);
        System.out.println(Arrays.toString(result));
    }
}
