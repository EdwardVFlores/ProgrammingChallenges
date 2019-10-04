package ProgrammingChallenges;

import java.util.Arrays;

/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public static void main(String[] args){
        int[] list = new int[] {0,1,0,3,12};
        int[] test = moveZeroes(list);
        System.out.println(Arrays.toString(test));
    }

    public static int[] moveZeroes(int[] nums){
        int swap;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0)
                for(int j = i; j < nums.length; j++){
                    if(nums[j] > 0) {
                        swap = nums[j];
                        nums[j] = nums[i];
                        nums[i] = swap;
                        break;
                    }
            }
        }
        return nums;
    }
}
