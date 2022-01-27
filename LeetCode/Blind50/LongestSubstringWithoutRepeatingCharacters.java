class Solution {
    public int lengthOfLongestSubstring(String s) {
        int globalCounter = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(set.contains(c)) set.remove(s.charAt(left++));
            set.add(c);
            globalCounter = Math.max(globalCounter,right - left + 1);
        }
        return globalCounter;
    }
}