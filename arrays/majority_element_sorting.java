import java.util.*;

class majority_element_sorting {
    static int majorityElement(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        int candidate = arr[n / 2];

        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
        System.out.println(majorityElement(arr));

    }
}
