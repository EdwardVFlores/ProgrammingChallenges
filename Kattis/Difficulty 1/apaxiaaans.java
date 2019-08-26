package programmingchallenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/apaxiaaans
 */

public class apaxiaaans {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char lastChar = ' ';
        for(int i = 0; i < input.length(); i++){
            if(lastChar != input.charAt(i)) {
                System.out.print(input.charAt(i));
                lastChar = input.charAt(i);
            }
        }
    }
}
