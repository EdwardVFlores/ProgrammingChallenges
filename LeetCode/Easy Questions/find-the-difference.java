class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        int[] chars = new int[26];
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i) - 'a';
            chars[val]++;
        }
        for(int i = 0; i < t.length(); i++){
            int val = t.charAt(i) - 'a';
            chars[val]--;
            if(chars[val] < 0) return t.charAt(i);
        }
        return 'L';
    }
} 