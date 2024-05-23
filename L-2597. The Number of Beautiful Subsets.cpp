

class Solution {
public:
    int res;
    int K;
    void fun(vector<int> &nums, int idx, unordered_map<int, int> &mp) {
        if(idx == nums.size()) {
            res++;
            return;
        }
        fun(nums, idx + 1, mp);
        if(!mp[nums[idx] - K] && !mp[nums[idx] + K]) {
            mp[nums[idx]]++;
            fun(nums, idx + 1, mp);
            mp[nums[idx]]--;
        }
    }

    int beautifulSubsets(vector<int>& nums, int k) {
        res = 0;
        K = k;
        unordered_map<int, int> mp;
        fun(nums, 0, mp);
        return res - 1;
    }
};
