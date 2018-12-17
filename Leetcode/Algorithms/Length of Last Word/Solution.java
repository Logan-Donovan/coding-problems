class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        String[] words = s.split(" ");
        if (words.length > 0){
            lastWordLength = words[words.length - 1].length();
        }
        
        return lastWordLength;
    }
    
    //faster solution
    public int lengthOfLastWord2(String s) {
        s = s.trim();
        return s.length() - (s.lastIndexOf(' ')+1);
    }
}
