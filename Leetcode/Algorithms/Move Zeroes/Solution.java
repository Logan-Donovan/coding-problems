//Problem: https://leetcode.com/problems/move-zeroes/description/

public class Solution {
    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        int validIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                numZeros++;
            }else{
               nums[validIndex] = nums[i];
                validIndex++;
            }
        }
        Arrays.fill(nums, nums.length-numZeros, nums.length, 0);
    }
}

//alternate solution, similar concept, different impelementation.

public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}
