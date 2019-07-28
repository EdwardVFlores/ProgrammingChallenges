package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/bela
 * 
 */

public class Bela{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numCards = input.nextInt() * 4;
        char domCard = input.next().charAt(0);
        String card;
        int total=0;
        HashMap<Character, Integer> Dom = getDoms();
        HashMap<Character, Integer> nonDom = getNonDoms();
        for(int i=0; i<numCards;i++){
            card = input.next();
            if(card.charAt(1)==domCard){
                total += Dom.get(card.charAt(0));
            }else{
                total += nonDom.get(card.charAt(0));
            }
        }
        System.out.println(total);
    }

    private static HashMap<Character, Integer> getNonDoms() {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('A', 11);
        hm.put('K', 4);
        hm.put('Q', 3);
        hm.put('J', 2);
        hm.put('T', 10);
        hm.put('9', 0);
        hm.put('8', 0);
        hm.put('7', 0);
        return hm;
    }

    private static HashMap<Character, Integer> getDoms() {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 11);
        hm.put('K', 4);
        hm.put('Q', 3);
        hm.put('J', 20);
        hm.put('T', 10);
        hm.put('9', 14);
        hm.put('8', 0);
        hm.put('7', 0);
        return hm;
    }
}