// time : 
// space : 

class Solution {
    public int lengthOfLastWord(String s) {
        String newString = s.trim();
        int lastSpaceIndex = newString.lastIndexOf(' ');
        return (lastSpaceIndex == -1) ? newString.length() : newString.length() - lastSpaceIndex - 1;
    }
}
