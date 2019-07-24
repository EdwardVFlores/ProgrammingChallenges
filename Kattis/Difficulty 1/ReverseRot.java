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
        char[] list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
        HashMap<Character, Integer> charList = new HashMap<>();
        for(int i=0;i<list.length;i++){
            charList.put(list[i],i);
        }
        while(numRot>0){
            Deque<Character> stack = new ArrayDeque<>();
            char[] msg = input.next().toCharArray();
            for(char c : msg){
                stack.push(list[((charList.get(c) + numRot)%28)]);
            }
            for(char c : msg){
                System.out.print(stack.poll());
            }
            System.out.println();
            numRot = input.nextInt();
        }
    }
}