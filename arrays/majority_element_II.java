import java.util.ArrayList;

public class majority_element_II {

    static ArrayList<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int x = n / 3;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;

            if (result.contains(arr[i])) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > x) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2, 2, 3, 3, 2 };
        ArrayList<Integer> majorityElements = majorityElement(arr);
        System.out.println(majorityElements);
    }
}