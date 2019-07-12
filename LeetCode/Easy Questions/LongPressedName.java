package programmingchallenges;

/**
 * @author Edward Flores
    * Link: https://leetcode.com/problems/long-pressed-name/
 */

public class LongPressedName{
    public static void main(String[] args){
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()) return false;
        int start=0;
        
        for(int i=0; i<name.length();i++){
            if(name.charAt(i) != typed.charAt(start)) return false;
            while(name.charAt(i) == typed.charAt(start) && typed.length()-1>start){
                start++;
            }
            
        }
       
        return firstString.equals(secondString);
    }
}