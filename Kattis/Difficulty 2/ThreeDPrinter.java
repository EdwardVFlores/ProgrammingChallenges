package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/3dprinter
 */

public class ThreeDPrinter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int statues = in.nextInt();
        int n = 0;
        while(Math.pow(2, n) < statues) n++;
        System.out.println(n+1);
    }
   
}