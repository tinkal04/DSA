
class Solution {
    public List<Integer> PsTriangle(int numRow) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < numRow; col++) {
            ans = ans * (numRow - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            ans.add(PsTriangle(row));
        }
        return ans;
    }
}
