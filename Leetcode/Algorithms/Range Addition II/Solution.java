//Problem: https://leetcode.com/submissions/detail/112336113/

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++){
            if (ops[i][0] < m) m = ops[i][0];
            if (ops[i][1] < n) n = ops[i][1];
        }
        return m*n;
    }
}
