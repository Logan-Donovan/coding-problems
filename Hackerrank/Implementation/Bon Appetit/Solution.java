//Problem: https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += (i==k) ? 0 : ar[i];
        }
        sum /= 2;
        if(sum==b){
            System.out.println("Bon Appetit");
        }else{
            return b-sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if (result != 0) System.out.println(result);
    }
}
