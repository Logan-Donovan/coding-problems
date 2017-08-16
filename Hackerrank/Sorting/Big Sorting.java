import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
    
        Method: Use Arrays.sort() with a custom comparator that compares large strings as integers. Then use a
        StringBuilder to ouput the Strings in the newly sorted array.
      
        Time Complexity: O(n log(n)) //It takes n^2 time to run insertion sort on an array 
        Space Complexity: O(n) //We dynamically allocate an array to store the input
    
    */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return StringAsIntegerCompare(a,b);
            }
        });
        StringBuilder output = new StringBuilder("");
        for(String num: unsorted){
            output.append(num+"\n");
        }
        System.out.println(output);
        }
    
    // 0 indicates a=b | 1 indicates a>b | -1 indicates b>a
    public static int StringAsIntegerCompare(String a, String b){
        if(a.length() > b.length()) return 1;
        if(b.length() > a.length()) return -1;
        for(int i = 0; i < a.length(); i++){
            //casting each char in both strings from left to right and comparing their size.
            
            //if two strings representing integers are the same size, the first string to have a bigger number
            //than the other is the bigger number.
            //ex: 1553 > 1543
            if((int)a.charAt(i) > (int)b.charAt(i)) return 1;
            if((int)b.charAt(i) > (int)a.charAt(i)) return -1;
        }
        return 0;
    }
    }
