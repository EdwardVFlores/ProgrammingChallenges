class Solution {
    public int findNumbers(int[] nums) {
        // Time: O(N) where n is size of array
        int count = 0;
        for(int n : nums){
            String number = Integer.toString(n);
            if(number.length() % 2 == 0) count++;
        }
        return count;
    }
}