/*class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        int n = word.length;
        int k = n - 1;

        for (int i = 0; i < n / 2; i++) {
            swap(word, i, k);
            k--;
        }

        return String.join(" ", word);
    }

    private void swap(String[] word, int i, int k) {
        String temp = word[i];
        word[i] = word[k];
        word[k] = temp;
    }
}
*/

//optimised 
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int idx = cleanSpaces(arr);

        reverse(arr, 0, idx - 1);

        int start = 0;
        for (int i = 0; i < idx; i++) {
            if (arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        reverse(arr, start, idx - 1);

        return new String(arr, 0, idx);
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private int cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            while (j < n && arr[j] == ' ') j++;
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++];
            while (j < n && arr[j] == ' ') j++;
            if (j < n) arr[i++] = ' ';
        }
        return i;
    }
}
