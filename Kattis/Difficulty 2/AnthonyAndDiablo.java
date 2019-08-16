package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/anthonyanddiablo
 */

public class AnthonyAndDiablo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Double A = Double.parseDouble(in.next());
        Double C = Double.parseDouble(in.next());
        System.out.println((A < Math.pow(C, 2)/(4.0*Math.PI))?"Diablo is happy!":"Need more materials!");
    }
}