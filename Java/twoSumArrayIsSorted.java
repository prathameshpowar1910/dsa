class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int numLeft,numRight;

        while (left<right) {
            numLeft = numbers[left];
            numRight = numbers[right];

            if (numLeft + numRight == target) break ;

            if (numLeft + numRight < target) {
                left++;
                continue;
            }
            right--;
        }

        return new int[] { left+1, right+1};
    }
}
