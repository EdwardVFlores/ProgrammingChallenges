package programmingchallenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/iboard
 */

public class iBoard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine()) != null){
            int zero = 0, ones = 0;
            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                for(int k = 0; k < 7; k++){
                    if((c & 1) == 0){
                        zero++;
                    } else ones++;
                    c >>= 1;
                }
            }
            System.out.println((zero%2 == 0 && ones%2==0)?"free":"trapped");
        }
    }
}
