package programmingchallenges;
import java.util.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/greedilyincreasing
 */

public class GreedilyIncreasing{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt(), current = Integer.MIN_VALUE, next, counter=0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers; i++){
            if((next = in.nextInt()) > current){
                counter++;
                sb.append(next).append(" ");
                current = next;
            }
        }
        System.out.println(counter);
        System.out.println(sb.toString().substring(0,sb.length()-1));
    }
}