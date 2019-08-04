package programmingchallenges;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/numbertree
 * 
 */

public class NumberTree{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int levels = keyboard.nextInt();
        int root = 1;
        String path = keyboard.hasNext() ? keyboard.next(): "";
        for(int i = 0; i < path.length(); i++){
            char letter = path.charAt(i);
            if(letter == 'L') root <<= 1;
            else root = (root << 1) + 1;
        }
        System.out.println((1 << (levels+1)) - root);
 }
}