class Solution {
    public int findMin(int[] nums) {
        return nums[binarySearch(nums,0,nums.length - 1)];
    }
    public int binarySearch(int[]nums, int left, int right){
        int mid = left + (right - left) / 2;
        while(left < right){
            mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

}