//This is a brute-force approach
//Time Complexity : O(n^2)

class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        
        int largest = 0;
        int n = heights.size();
        for (int i=0 ; i<n; i++) {
            int sum = heights[i];
            int j = i-1;
            int k = i+1;
            while (k<n &&  heights[k]>=heights[i]) {
                sum+=heights[i];
                k++;
            }
            while (j>=0 &&  heights[j]>=heights[i]) {
                sum+=heights[i];
                j--;
            }
            largest = max(largest,sum);
        }
        return largest;
    }
};
