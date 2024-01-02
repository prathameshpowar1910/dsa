class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSumOfN = n*(n+1)/2;
        int actualTotal = 0;
        for (int i = 0 ; i < n ; i++) {
            actualTotal += nums[i];
        }

        return totalSumOfN - actualTotal;
    }
}
