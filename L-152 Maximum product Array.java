class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }
}
