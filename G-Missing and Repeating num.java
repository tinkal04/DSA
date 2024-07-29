class Solve {
    int[] findTwoElement(int arr[], int n) {
         int[] hash=new int[n+1];
         for(int i=0;i<n;i++){
             hash[arr[i]]++;
         }
         int rep=-1;
         int missing=-1;
         for(int i=1;i<=n;i++){
             if(hash[i]==2){
                 rep=i;
             }
             else if(hash[i]==0){
                 missing=i;
             }
             if(rep !=-1 && missing !=-1){
                 break;
             }
         }
         int[] ans ={rep,missing};
         return ans;
        
    }
}
