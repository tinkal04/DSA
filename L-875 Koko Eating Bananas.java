class Solution {
    public static int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }

    public static int calculateTotalHour(int[] piles, int h) {
        int total_H = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            total_H += Math.ceil((double)piles[i] / (double)(h));
        }
        return total_H;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while (low <= high) {
            int mid = (low + high) / 2;
            int total_H = calculateTotalHour(piles, mid);
            if (total_H <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
