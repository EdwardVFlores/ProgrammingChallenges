/**
    Edward Flores
    https://leetcode.com/problems/majority-element/
*/ 
class solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int newNumber = count.getOrDefault(nums[i], 0) + 1;
            if(newNumber > nums.length / 2) return nums[i];
            count.put(nums[i], newNumber);
        }
        return -1;
    }
}