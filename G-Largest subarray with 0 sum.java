class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum=0;
        int maxi=0;
        HashMap<Integer, Integer> mpp=new HashMap<Integer, Integer>();
        for(int i=0; i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(mpp.get(sum) !=null){
                    maxi=Math.max(maxi,i- mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
          return maxi;
    }
  
}
