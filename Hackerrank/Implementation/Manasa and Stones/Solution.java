//Problem: https://www.hackerrank.com/challenges/manasa-and-stones

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++){
            int stones = input.nextInt()-1;
            int a = input.nextInt();
            int b = input.nextInt();
            if(a==b){
                System.out.println(a*stones + " ");
                continue;
            }
            int temp = a;
            a = Math.min(a,b);
            b = (a==b) ? temp : b;
            int min = a*stones;
            int max = b*stones;
            
            for (int j = min; j <= max; j+=(b-a) ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
