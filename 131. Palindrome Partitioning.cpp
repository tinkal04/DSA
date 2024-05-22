class Solution {
public:
    int n;

    bool isPalindrome(string &s, int l, int r) {
        while (l < r) {
            if (s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    void fun(string &s, int ind, vector<string> &current, vector<vector<string>> &res) {
        if (ind == n) {
            res.push_back(current);
            return;
        }
        for (int i = ind; i < n; i++) {
            if (isPalindrome(s, ind, i)) {
                current.push_back(s.substr(ind, i - ind + 1)); 
                fun(s, i + 1, current, res);
                current.pop_back();
            }
        }
    }

    vector<vector<string>> partition(string s) {
        vector<vector<string>> res;
        vector<string> current;
        n = s.length();
        fun(s, 0, current, res);
        return res;
    }
};
