// auxilliary arrays used here with time and space complexity of O(n)

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedWater = 0;
        
        //left_max
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1 ; i<n ; i++) {
            left[i] = Math.max(left[i-1],height[i]);
        }

        //right_max
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for (int i = n-2 ; i>=0 ; i--) {
            right[i] = Math.max(right[i+1],height[i]);
        }
        
        //trapped_water
        for (int i = 0 ; i<n ; i++) {
            int waterLevel = Math.min(left[i],right[i]);
            trappedWater = trappedWater + ( waterLevel - height[i]);
        }
        return trappedWater;
    }
}
