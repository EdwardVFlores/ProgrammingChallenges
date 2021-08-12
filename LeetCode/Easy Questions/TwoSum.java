import java.util.*;

class TwoSum {
    public static void main(String[] args){
        int[] testNums = new int[]{1,2,3,4};
        int[] ans = runningSum(testNums);
        for(int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
       if(nums.length < 2) return nums;
       for(int i = 1; i <= nums.length - 1; i++) {
           nums[i] =  nums[i - 1] + nums[i];
       }
       return nums;
    }
}
