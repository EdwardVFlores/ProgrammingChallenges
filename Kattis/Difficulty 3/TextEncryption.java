package ProgrammingChallenges;
import java.util.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/textencryption
 */

public class TextEncryption {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        while((num = Integer.parseInt(scan.nextLine()))!=0){
            String line = scan.nextLine();
            if(line.length() < num) {
                System.out.println(line.replaceAll(" ","").toUpperCase());
                System.out.println();
            } else {
                line = line.replaceAll(" ", "").toUpperCase();
                char[] ans = new char[line.length()];
                int next = 0;
                for (int i = 0, j = 0; i < line.length(); i++, j += num) {
                    if(j>=line.length()) j = ++next;
                    ans[j] = line.charAt(i);
                }
                for (char c : ans) System.out.print(c);
                System.out.println();
            }

        }
    }
}
