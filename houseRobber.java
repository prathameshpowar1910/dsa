//PROBLEM NO 198 LEETCODE
// TIME AND SPACE BOTH O(n)

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] totalLoot = new int[n];
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0],nums[1]);

        totalLoot[0] = nums[0];
        totalLoot[1] = Math.max(nums[0],nums[1]);

        for (int i = 2 ; i<n ; i++) {    
            totalLoot[i] = Math.max(totalLoot[i-2] + nums[i] , totalLoot[i-1]);
        }

        return totalLoot[n-1];
    }
}
