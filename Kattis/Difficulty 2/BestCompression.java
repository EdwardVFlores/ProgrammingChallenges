package programmingchallenges;
import java.util.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/bestcompression
 */

public class BestCompression{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double F = in.nextDouble(), b = in.nextDouble();
        System.out.println((Math.pow(2.0, (b+1.0))-1 >= F)?"yes":"no");
    }
}