package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/alphabet
 */

public class Alphabet{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(26 - LIS(in.next())); 
    }
    public static int LIS(String array) {
        int[] dp = new int[array.length()];
        int max = 0;
        for(int i = 0; i < array.length(); i++) {
            for(int j = i + 1; j < array.length(); j++) {
                if(array.charAt(j) > array.charAt(i)) {
                dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        max = Math.max(max, dp[i]);
        }
        return max + 1;
    }
    
}