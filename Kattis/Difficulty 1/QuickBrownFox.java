package programmingchallenges;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/quickbrownfox
 */

public class QuickBrownFox{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = Integer.valueOf(input.nextLine());
        while(testCases > 0){
            char[] inputString = input.nextLine().toLowerCase().toCharArray();
            HashMap<Character, Character> chars = new HashMap<>();
            char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for(char c : abc){
                chars.put(c, c);
            }
            for(char c:inputString){
                if(chars.containsKey(c)){
                    chars.remove(c);
                }
            }
            if(chars.keySet().isEmpty()) System.out.println("pangram");
            else{
                System.out.print("missing ");
                for(char c : chars.keySet()){
                    System.out.print(c);
                }
                System.out.println();
            }
            testCases--;
        }
    }
}