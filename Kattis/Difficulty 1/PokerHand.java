package programmingchallenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/pokerhand
 */

public class PokerHand{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> list = new HashMap<>();
        String[] cardList = input.nextLine().split(" ");
        for(String s : cardList){
            if(list.containsKey(s.charAt(0))){
                list.replace(s.charAt(0), list.get(s.charAt(0))+1);
            }
            else{   
                list.put(s.charAt(0), 1);
            }
        }
        System.out.println(Collections.max(list.values()));
    }
}