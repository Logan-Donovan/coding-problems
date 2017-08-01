//Problem: https://leetcode.com/problems/find-the-difference/discuss/

/* concept: if you get the integer value of each string by adding together the char values,
*  the difference between the two integer values will be the additional char in string t.
*  since t is 1 char longer than s, you can assign the additional char value to the t integer
*  and just subtract char values from the s string and add char values from the t string.
*/

public class Solution {
    public char findTheDifference(String s, String t) {
        int charCode = t.charAt(s.length());
        
        for (int i = 0; i<s.length(); i++){
            charCode += (int)t.charAt(i);
            charCode -= (int)s.charAt(i);
        }
        return (char)charCode;
    }
}
