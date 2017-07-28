//Problem: https://leetcode.com/problems/detect-capital/tabs/description

public class Solution {
    public boolean detectCapitalUse(String word) {
        char firstLetter = word.charAt(0);
        if(Character.isLowerCase(firstLetter)){
            if (word.equals(word.toLowerCase())) return true;
        }
        if(Character.isUpperCase(firstLetter)){
            if (word.equals(word.toUpperCase())) return true;
            if (word.substring(1).equals(word.substring(1).toLowerCase())) return true;
        }
        return false;
    }
}
