//Problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/tabs/description

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left<right){
            int v = numbers[left] + numbers[right];
            if(v == target){
                result[0] = left +1;
                result[1] = right +1;
                break;
            }
            else if (v > target){
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
