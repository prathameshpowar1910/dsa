//optimised solution with time complexity of O(n^2) + O(nlogn)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        for (int i = 0 ; i<n-2 ; i++) {

            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i+1;
            int right = n-1;

            while (left<right) {
                int check = nums[left]+nums[right]+nums[i];
                if (check==0) {
                    res.push_back({nums[left],nums[right],nums[i]});
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left < right && nums[right + 1] == nums[right]) {
                        right--;
                    }
                } else if(check<0) {
                    left++;
                } else if (check>0) {
                    right--;
                }
            }
        }
        return res;
    }
};
