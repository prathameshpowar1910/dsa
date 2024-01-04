class Solution {
    public String mergeAlternately(String word1, String word2) {

        String merged = "";
        int length1 = word1.length();
        int length2 = word2.length();
        
        int i = 0;
        while (i < length1 || i < length2) {
            if (length1 > i) {
                merged += word1.charAt(i) ; 
            }
            if (length2 > i) {
                merged += word2.charAt(i) ; 
            }
            i++;
        }

        return merged;
    }
}
