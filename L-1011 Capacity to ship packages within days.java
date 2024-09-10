class Solution {
    public int capacity(int[] weights, int capacity){
        int n=weights.length;
        int days=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+weights[i]>capacity){
                days+=1;
                load=weights[i];
                }
                else{
                     load += weights[i];
                }
        }
    return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low= Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid = low + (high - low) / 2;
            int requireDay=capacity(weights, mid);
            if(requireDay<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
        
    }
}
