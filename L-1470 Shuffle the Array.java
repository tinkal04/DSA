class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=0;i<2*n;i++){
            int curPos=i;
            int curNum=nums[curPos];
            int newPos=0;
            while(curNum>0){
                if(curPos<n){
                    newPos=2*curPos;
                }
                else{
                    newPos=2*(curPos-n)+1;
                }
                int temp=nums[newPos];
                nums[newPos]=-curNum;
                curNum=temp;
                curPos=newPos;
            }

        }
        for(int i=0;i<2*n;i++){
            nums[i]=Math.abs(nums[i]);
        }

        return nums; 

    }
}
