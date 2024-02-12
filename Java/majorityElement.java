//PROBLEM NO 169
// Uses moores voting algo

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorEle = 0;
        for (int num: nums){
            if (count == 0) {
                majorEle = num;
                count = 1;
            } else if (majorEle == num) {
                count++;
            } else {
                count--;
            }
        }

        return majorEle;
    }
}
