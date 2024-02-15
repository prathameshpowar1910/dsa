//PROBLEM NO 2971

class Solution {
    public long largestPerimeter(int[] nums) {
        if (nums.length<3) return -1;
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sum) {
                ans = nums[i] + sum;
            }
            sum += nums[i];
        }
        
        return ans;
    }
}
