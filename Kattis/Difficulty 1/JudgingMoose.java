package programmingchallenges;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/judgingmoose
 * 
 */

public class JudgingMoose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fn = sc.nextInt(), sn = sc.nextInt();
        if(fn == 0 && sn == 0) System.out.println("Not a moose");
        else if(fn > sn) System.out.println("Odd " + (fn * 2));
        else if(fn < sn) System.out.println("Odd " + (sn * 2));
        else System.out.println("Even "+ (fn + sn));
    }
}