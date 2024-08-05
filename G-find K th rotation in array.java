class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
      
        int n = arr.size();
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else if (arr.get(mid) < arr.get(high)) {
                high = mid;
            } else {
               
                if (arr.get(mid) == arr.get(low)) {
                    low++;
                } else if (arr.get(mid) == arr.get(high)) {
                    high--;
                }
            }
        }
        return low;
    
    }
}
