import java.util.Arrays;

public class AggressiveCows {
    // Helper function to check if we can place 'cows' with at least 'mid' distance apart
    public static boolean check(int[] nums, int mid, int cows) {
        int n = nums.length;
        int count = 1;  // We can place the first cow in the first stall
        int lastPosition = nums[0];  // The position of the last placed cow
        
        for (int i = 1; i < n; i++) {
            if (nums[i] - lastPosition >= mid) {
                count++;  // Place another cow
                lastPosition = nums[i];  // Update the position of the last placed cow
            }
            if (count >= cows) return true;  // If we've placed all cows, return true
        }
        return false;  // Not enough distance to place all cows
    }

    // Function to find the largest minimum distance possible to place 'k' cows
    public static int cows(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);  // Sort the stalls' positions
        
        int low = 0;
        int high = nums[n - 1] - nums[0];  // Maximum possible distance
        
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;  // Try placing cows with 'mid' as the minimum distance
            if (check(nums, mid, k)) {
                result = mid;  // If we can place all cows, save the result and try for a larger distance
                low = mid + 1;  // Search the right half for a larger minimum distance
            } else {
                high = mid - 1;  // Otherwise, search the left half for a smaller minimum distance
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};  // Example stalls positions
        int cows = 3;  // Number of cows to place
        System.out.println("Largest Minimum Distance: " + cows(stalls, cows));
    }
}
