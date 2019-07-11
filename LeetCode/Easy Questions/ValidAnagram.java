package programmingchallenges;

import java.util.HashMap;

/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/valid-anagram/
 */

public class ValidAnagram{
    public static void main(String[] args){
        System.out.println(isAnagram("ab","bc"));   
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)) map.replace(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c, map.get(c) - 1);
                if(map.get(c)==0) map.remove(c);
            } 
            else {
                map.put(c, 1);
            }
        }
        return map.isEmpty();
    }
}