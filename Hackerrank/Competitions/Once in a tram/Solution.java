import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

//Problem: https://www.hackerrank.com/contests/w34/challenges/once-in-a-tram/submissions/code/1302641453

public class Solution {

    static String onceInATram(int x) {
        String number = Integer.toString(x);
        boolean check = false;
        while (!check){
            x++;
            number = Integer.toString(x);
            check = checkEqual(number);
        }
        return Integer.toString(x);
    }
    
    static boolean checkEqual(String number){
        int first = Character.getNumericValue(number.charAt(0)) + Character.getNumericValue(number.charAt(1)) + Character.getNumericValue(number.charAt(2));
        int last = Character.getNumericValue(number.charAt(3)) + Character.getNumericValue(number.charAt(4)) + Character.getNumericValue(number.charAt(5));
        if (first == last) return true;
        return false;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    String result = onceInATram(x);
    System.out.println(result);
    }
}
