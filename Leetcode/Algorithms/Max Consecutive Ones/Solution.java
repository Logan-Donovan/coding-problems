//Problem: https://leetcode.com/problems/max-consecutive-ones/description/

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for( int num : nums){
            if(num == 1) count++;
            if(num == 0) count = 0;
            if(count > max) max = count;
        }
        return max;
    }
}
