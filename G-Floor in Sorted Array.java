class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
    int low = 0, high = n - 1;
    int ans = -1;  // Initialize ans to -1 to handle the case where no floor is found

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] <= x) {
            ans = mid; // Update ans to the current index
            low = mid + 1; // Move to the right half to find a potentially larger floor
        } else {
            high = mid - 1; // Move to the left half
        }
    }

    // Return the index of the floor value, or -1 if no floor value is found
    return ans;
}

}
