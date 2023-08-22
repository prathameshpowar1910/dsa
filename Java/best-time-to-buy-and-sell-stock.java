//Time: O(n)
//Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 , l=0 , r=0;
        while (r<prices.length) {
            if (prices[r]>prices[l]) {
                max = Math.max(max,prices[r]-prices[l]);
            } else {
                l=r;
            }
            ++r;
        }
    return max;
    }
}
