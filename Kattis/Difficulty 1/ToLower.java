package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/tolower
 */

public class ToLower{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int contest = in.nextInt(), problems = in.nextInt(), ans = 0;
        for(int i = 0; i < contest; i++){
            boolean flag = true;
            for(int j = 0; j < problems; j++){
                char[] s = in.next().toCharArray();
                for(int k = 1; k < s.length; k++){
                    if(Character.isUpperCase(s[k])) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) ans++;
        }
        System.out.println(ans);
    }
}