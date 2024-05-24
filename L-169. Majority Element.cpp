// bruth force
//tc=O(n^2)
//sc=O(1)
int c=0;
int n=nums.size()
for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
    if(nums[j]==nums[i]){
      c++;}
  }
  if(c==n/2){
    return nums[i]
      }
}
return -1;

// better solution 
//Tc=O(n)+O(logn)
//sp=O(n)
map<int ,int> mpp;
for(int i=0;i<n;i++){
  mpp[nums[i]]++;
}
for(auto it:mpp){
  if(it.second>n/2){
    return it.first;
  }
}

// optimal solution
//tc=O(n)+O(n)
//sc=O(1)
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int counter = 0;
        int ele = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            if (counter == 0) {
                counter = 1;
                ele = nums[i];
            } else if (ele == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                c1++;
            }
        }
        if (c1 > n / 2) {
            return ele;
        }
        return -1;
    }
};
  
      
