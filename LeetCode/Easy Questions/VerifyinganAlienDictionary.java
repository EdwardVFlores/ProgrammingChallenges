import java.util.*;

/**
 * Description: HashMap Help.
 * Link: https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
class VerifyinganAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> orderhm = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            orderhm.put(order.charAt(i), i);
        }
        for(int i = 0; i < words.length - 1; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(j >= words[i+1].length()) return false;
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    if(orderhm.get(words[i].charAt(j)) > orderhm.get(words[i+1].charAt(j)))
                        return false;
                    break;
                }
            }
        }
        return true;
    }
}