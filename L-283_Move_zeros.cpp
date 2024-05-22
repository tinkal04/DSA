class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j=-1;
        for(int i=0;i<nums.size();i++){
            if( nums[i]==0){
                j=i;
                break;
            }
        }
        if (j==-1){
            return ;
        }
        for(int i=j+1;i<nums.size();i++){
            if (nums[i]!=0){
                swap(nums[i],nums[j]);
                j++;
            }
        }

        
        
    }
};
// bruth-force approch:-taking temp array and put ele into temp which are non-zero number at fron t and remain are zero......
// but if we donr=t want to use extra sapce?
// optimal approch>-two pointer approch
//first we find zero index takein j which is iinitally -1 .... using for loop for find zero ele index ....and swapping them
