class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while(l < r){
            int smallerValue = Math.min(height[l], height[r]);
            int product = (r - l) * smallerValue;
            ans = Math.max(ans, product);
            if(height[l] < height[r])
                l++;
            else 
                r--;
        }
        return ans;
    }
}