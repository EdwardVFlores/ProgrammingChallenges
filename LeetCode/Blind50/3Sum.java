class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> answers = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            HashMap<Integer, Integer> complimentary = new HashMap<>();
            for(int j = i+1; j < nums.length; j++){
                int comp = (- nums[i] - nums[j]);
                int foundValue = binarySearch(nums, comp, j + 1);
                if(foundValue >= 0) {
                    ArrayList<Integer> triples = new ArrayList<>();
                    triples.add(nums[i]); // first Num
                    triples.add(nums[j]); // sec Num
                    triples.add(nums[foundValue]); // third Num
                    set.add(triples);
                }
            }
        }
        set.forEach((item)->answers.add(item));
        return answers;
    }
    public int binarySearch(int[] nums, int findValue, int start){
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == findValue) return mid;
            if(nums[mid] < findValue) start = mid + 1;
            else if (nums[mid] > findValue) end = mid - 1;
        }
        return -1;
    }
}