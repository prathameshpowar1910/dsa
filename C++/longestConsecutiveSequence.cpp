// time O(n) + O(nlogn)
// this is good approach but not optimal

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.size()==0) return 0;
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int lastSmaller = INT_MIN;
        int res = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            
            if (nums[i]-1 == lastSmaller) {
                count++;
                lastSmaller = nums[i];
            }

            else if (lastSmaller != nums[i]) {
                count = 1;
                lastSmaller = nums[i];
            }

            res = max(res,count);
        }

        return res;
    }
};
