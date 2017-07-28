//Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/tabs/description

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i< nums.length;i++)
            if (nums[i]!=nums[j]) nums[++j] = nums[i];
        return ++j;
    }
}
