class Solution{
    vector<int> findUnion(int arr1[], int arr2[], int n, int m) {
  
     set<int> unionSet;

  
  for (int i = 0; i < n; i++) {
    unionSet.insert(arr1[i]);
  }
  for (int j = 0; j < m; j++) {
    unionSet.insert(arr2[j]);
  }

  
  vector<int> result(unionSet.begin(), unionSet.end());

  return result;
}
};
