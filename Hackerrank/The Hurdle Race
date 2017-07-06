import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int max = 0;
        for (int hurdle: height){
            if (hurdle > max) max = hurdle;
        }
        if(k>max){
        System.out.println(0);
        }else{
            System.out.println(max-k);
        }
    }
}
