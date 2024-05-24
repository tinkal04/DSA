// bruth force
//tc=O(n^3)
//sp=O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxx=nums[0];
        int n=nums.size();
        for(int i=0;i<n;i++){
          int sum=0;
          for(int j=i;j<n;j++){
            for(int k=0;k<n;k++){
              sum+=nums[k];
            }
            maxx=max(sum,maxx);
        }
            

    }
      return maxx;
};
// better Approch
//tc=O(n62)
//sc=O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxx=nums[0];
        int n=nums.size();
        for(int i=0;i<n;i++){
          int sum=0;
          for(int j=i;j<n;j++){
              sum+=nums[j];
            maxx=max(sum,maxx);
        }   }
      return maxx;
};
//optimal
//tc=O(N)
//sc=O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max=nums[0];
        int sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;}
            if(sum<0){
                sum=0;
            }
        }
         return max;

    }
};
