package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/reverserot
 */

public class ReverseRot {
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numRot = input.nextInt();
        String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        HashMap<Character, Integer> charList = new HashMap<>();
        for(int i=0;i<list.length();i++){
            charList.put(list.charAt(i),i);
        }
        while(numRot>0){
            Deque<Character> stack = new ArrayDeque<>();
            String msg = input.next();
            for(int i=0;i<msg.length();i++){
                stack.push(list.charAt((charList.get(msg.charAt(i)) + numRot)%28));
            }
            for(int i=0;i<msg.length();i++){
                System.out.print(stack.poll());
            }
            System.out.println();
            numRot = input.nextInt();
        }
    }
}