


// approch:-1
//tc=O(nlogn)
//sc=O(1)
sort(nums.begin(),nums.end());
for(x=0;x<=n;x++){
int ind=lower_bound(nums.begin(),end.begin(),x)-nums.begin();
count=n-ind;
if(count==x){
  return x;
}
return -1;




//TC=O(long*long)+n(logn)
//sc=O(1)
class Solution {
public:
    int specialArray(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int l=0;
        int r=n;
        while(l<=r){
            int mid=(l+r)/2;
            int idx=lower_bound(nums.begin(),nums.end(),mid)-nums.begin();
            int count=n-idx;
            if(count==mid){
                return mid;
            }
            else if(count>mid){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;

    }
};
