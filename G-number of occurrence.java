class Solution {
    public static int first(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; // Continue searching in the left part
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int second(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int second = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                second = mid;
                low = mid + 1; // Continue searching in the right part
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return second;
    }

    public static int[] check(int[] arr, int n, int x) {
        int first = first(arr, n, x);
        if (first == -1) {
            return new int[] {-1, -1};
        } else {
            int last = second(arr, n, x);
            return new int[] {first, last};
        }
    }

    public static int count(int[] arr, int n, int x) {
        int[] ans = check(arr, n, x);
        if (ans[0] == -1) {
            return 0;
        }
        return ans[1] - ans[0] + 1;
    }
}
