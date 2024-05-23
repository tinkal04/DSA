public:
    int lenOfLongSubarr(int A[], int N, int K) {
    unordered_map<int, int> pre_Sum_Map;
    int sum = 0;
    int maxLength = 0;

    for (int right = 0; right < N; ++right) {
        sum += A[right];

        if (sum == K)
            maxLength = right + 1;

        if (pre_Sum_Map.find(sum - K) != pre_Sum_Map.end())
            maxLength = max(maxLength,right- pre_Sum_Map[sum - K]);

        if (pre_Sum_Map.find(sum) == pre_Sum_Map.end())
            pre_Sum_Map[sum] = right;
    }

    return maxLength;
}
