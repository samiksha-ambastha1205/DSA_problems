class farthest_seat {
    static int maxDistance(String seat) {
        int n = seat.length();
        int[] left = new int[n];
        int[] right = new int[n];
         int nearocc=-n;
        for (int i = 0; i < n; i++) {
            if (seat.charAt(i) == '1') {
                nearocc = i;
            } else {
                left[i] = i - nearocc;
            }
        }

        nearocc = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (seat.charAt(i) == '1') {
                nearocc = i;
            } else {
                right[i] = nearocc - i;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (seat.charAt(i) == '0') {
                res = Math.max(res, Math.min(left[i], right[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String seat = "1000101";
        System.out.println(maxDistance(seat));
    }
}
