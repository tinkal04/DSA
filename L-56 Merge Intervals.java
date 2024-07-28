class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result=new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1;i<n;i++){
            int[] last_merge=result.get(result.size()-1);
            int[] current=intervals[i];
            if(current[0]<=last_merge[1]){
                last_merge[1]=Math.max(last_merge[1],current[1]);
            }
            else{
                result.add(current);
            }
          
        }

      return result.toArray(new int[result.size()][]);


        
    }
}
