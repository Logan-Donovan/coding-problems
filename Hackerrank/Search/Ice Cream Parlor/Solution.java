import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Problem: https://www.hackerrank.com/challenges/icecream-parlor

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int trips = input.nextInt();
        for(int i = 0; i < trips; i++){
            int dollars = input.nextInt();
            int flavors = input.nextInt();
            Map<Integer, Integer> indexAndComp = new HashMap<>();
            for(int j = 1; j <= flavors; j++){
                int cost = input.nextInt();
                if(indexAndComp.containsKey(cost)){
                    System.out.println(indexAndComp.get(cost) + " " + j);
                }else{
                    indexAndComp.put(dollars-cost, j);
                }
            }
        }
    }
}
