//Problem: https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++) map.put(list1[i], i);
        for(int i = 0; i < list2.length; i++) {
            Integer index = map.get(list2[i]);
            if(index != null && i + index <= minSum){
                if(i + index < minSum){
                    result = new LinkedList<>();
                    minSum = i+index;
                }
                result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
