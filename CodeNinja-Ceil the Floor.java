import java.util.* ;
import java.io.*; 

public class Solution {
  public static int findFloor(int[] a, int n, int x){
    int low=0;
    int high=n-1;
    int ans=-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(a[mid]<=x){
        ans=a[mid];
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    return ans;
  }
  public static int findCeil(int[] a, int n, int x){
    int low=0;
    int high=n-1;
    int ans=-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(a[mid]>=x){
        ans=a[mid];
        high=mid-1;

      }
      else{
        low=mid+1;
      }
    }
    return ans;
  }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int f=findFloor(a, n, x);
      int c=findCeil(a, n, x);
      return new int[] {f,c};

      
    }
    
}
