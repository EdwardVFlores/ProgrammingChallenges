class Solution {
    // Time O(N) where N is dependent on size of candies
    // Space O(N) where N is dependent on size of candies
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            maxValue = Math.max(maxValue, candies[i]);
        }
        ArrayList answers = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            answers.add(candies[i] + extraCandies >= maxValue);
        }
        return answers;
    }
}