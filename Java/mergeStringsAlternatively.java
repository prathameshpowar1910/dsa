class Solution {
    public String mergeAlternately(String word1, String word2) {

        String merged = "";
        int length1 = word1.length();
        int length2 = word2.length();
        int largerLength = (length1 >= length2) ? length1 : length2;

        for (int i = 0 ; i < largerLength ; i++ ) {
            if (length1 > i) {
                merged += word1.charAt(i) ; 
            }
            if (length2 > i) {
                merged += word2.charAt(i) ; 
            }
        }

        return merged;
    }
}
