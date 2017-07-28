//Problem: https://leetcode.com/problems/fizz-buzz/tabs/description

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new LinkedList<String>();
        for (int i = 1; i<=n; i++){
            output.add(i-1, checkFizzBuzz(i) );
        }
        return output;
    }
    public String checkFizzBuzz(int n){
        if(n%3 == 0 && n%5 == 0) return "FizzBuzz";
        if(n%3 == 0 && n%5 != 0) return "Fizz";
        if(n%3 != 0 && n%5 == 0) return "Buzz";
        return Integer.toString(n);
    }
}
