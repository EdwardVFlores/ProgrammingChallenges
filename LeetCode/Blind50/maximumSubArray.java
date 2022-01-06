public int maxSubArray(int[] nums) {
    int overAllMax = Integer.MIN_VALUE;
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        overAllMax = Math.max(overAllMax, sum);
        if(sum < 0)
            sum = 0;
    }
    return overAllMax;
}