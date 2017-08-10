//Problem: https://leetcode.com/problems/distribute-candies/description/

public class Solution {
    public int distributeCandies(int[] candies) {
        int maxTypes = candies.length / 2;
        Set<Integer> types = new HashSet<Integer>();
        for (int candy : candies) {
            types.add(candy);
        }
        if(types.size() > maxTypes)
        {
            return maxTypes;
        }
        return types.size();
    }
}
