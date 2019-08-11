package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/apaxiaaans 
 */

public class Apax{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.next();
        int count = 0;
        for(int i = 0, j = 1; i < line.length()-1; i++,++j){
            System.out.println(line.charAt(i) + " " + line.charAt(j));
        }
    }
}