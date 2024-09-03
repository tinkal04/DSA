class Solution {
    public boolean solution(int bloomDay[], int day, int k, int m) {
        int n = bloomDay.length;
        int cnt = 0;
        int bouquets = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                bouquets += cnt / k;
                cnt = 0;
            }
        }
        bouquets += cnt / k;
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini;
        int high = maxi;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (solution(bloomDay, mid, k, m)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
