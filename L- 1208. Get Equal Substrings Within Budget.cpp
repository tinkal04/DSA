//tc=O(n)
class Solution {
public:
    int equalSubstring(string s, string t, int maxCost) {
        int n=s.size();
        int i=0;
        int j=0;
        int current_cost=0;
        int max_lenght=0;
        while(j<n){
            current_cost+=abs(s[j]-t[j]);
            while(current_cost>maxCost){
                current_cost-=abs(s[i]-t[i]);
                i++;
            }
            max_lenght=max(max_lenght,j-i+1);
            j++;
        }
        return max_lenght;
        
    }
};
