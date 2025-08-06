
class third_three_variable {
    static int thirdLargest(int[] arr) {
        int n = arr.length;

        if (n < 3) return -1;  // Optional: not enough elements

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        return third == Integer.MIN_VALUE ? -1 : third; // if no third largest
    }

    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Third Largest Element is: " + thirdLargest(arr));
    }
}
