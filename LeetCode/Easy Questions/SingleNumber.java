package programmingchallenges;
import java.util.HashSet;


/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/single-number/
 */

public class ProgrammingChallenges{
    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
    
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)) set.remove(n);
            else set.add(n);
        } 
        return set.iterator().next();
    }
}