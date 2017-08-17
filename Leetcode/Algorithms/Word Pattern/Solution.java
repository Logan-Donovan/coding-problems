//Problem: https://leetcode.com/problems/word-pattern/description/

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        String[] words = str.split(" ");
        if(words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++){
            char letter = pattern.charAt(i);
            if (!map.containsKey(letter)){ 
                if(map.containsValue(words[i])) return false;
                map.put(letter, words[i]);
            }else{ //letter is already paired with a word
                if(!map.get(letter).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
