//Problem: https://leetcode.com/problems/implement-strstr/tabs/description

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)){
        return haystack.indexOf(needle);
        }
        return -1;
    }
}
