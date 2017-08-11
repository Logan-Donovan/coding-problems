//Problem: https://leetcode.com/problems/majority-element/description/

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){ 
                map.put(num, 1);
            }else{
                int value = map.get(num);
                value++;
                map.put(num, value);
            }
            if(map.get(num) > nums.length / 2) return num;
        }
        return -1;
    }
}

//alernate, fastest solution:

/*
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}
*/
