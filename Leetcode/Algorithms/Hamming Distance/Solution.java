//Problem: https://leetcode.com/problems/hamming-distance/submissions/

class Solution {
    public int hammingDistance(int x, int y) {
        int sum = 0;
        int xor = x^y;
        while (xor != 0){
            xor &= (xor -1); //finds and strips the last non-zero bit
            sum++;
        }
        return sum;
    }
}
