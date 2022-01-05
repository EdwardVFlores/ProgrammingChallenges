public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> comp = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        int compliment = target - nums[i];
        if(comp.containsKey(nums[i])) {
            return new int[]{comp.get(nums[i]),i};
        } else {
            comp.put(compliment,i);
        }
    }
    return new int[]{-1,-1};
}