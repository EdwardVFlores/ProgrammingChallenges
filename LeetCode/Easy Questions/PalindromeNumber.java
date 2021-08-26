class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String num = Integer.toString(x);
        boolean check = true;
        int left = 0;
        for(int right = num.length() - 1; right >= 0; right--){
            if(num.charAt(right) == num.charAt(left++)){
                check = true;
            } else{
                check = false;
                break;
            }
        }
        return check;
    }
}