//Problem: https://leetcode.com/problems/plus-one/description/

public class Solution {
    public int[] plusOne(int[] digits) {
        int lastDig = digits[digits.length-1];
        int size = digits.length;
        boolean incSize = true;
        if(lastDig == 9){
            for(int digit : digits){
                if(digit!=9) incSize = false;
            }
            if(incSize){
                digits = new int[size+1];
                for(int i = 0; i < digits.length; i++){
                    if(i == 0){ digits[i] = 1;}
                    else{digits[i] = 0;}
                }
            }else{
                for(int i = digits.length-1; i >= 0; i--){
                    if(digits[i] != 9){
                        digits[i] = digits[i]+1;
                        break;
                    }
                    digits[i] = 0;
                }
            }
        }else{
            digits[digits.length-1] = lastDig + 1;
        }
        return digits;
    }
}
