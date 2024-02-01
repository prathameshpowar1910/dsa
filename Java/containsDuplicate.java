class Solution {
    public boolean containsDuplicate(int[] nums) {
        final int length = nums.length;
        if (length == 1)
            return false;
        if (length == 2)
            return nums[0] == nums[1];

        Set<Integer> num_set = new HashSet<Integer>();
        for(int num: nums){
            if(!num_set.add(num)) return true;
        }
        return false;
    }
}
