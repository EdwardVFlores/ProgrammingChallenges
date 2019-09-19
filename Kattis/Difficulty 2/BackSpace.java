package ProgrammingChallenges;
import java.io.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/backspace
 */
public class BackSpace {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '<') sb.deleteCharAt(sb.length()-1);
            else sb.append(line.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
