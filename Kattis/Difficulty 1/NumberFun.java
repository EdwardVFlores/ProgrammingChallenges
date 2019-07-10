package programmingchallenges;

import java.util.Scanner;
import java.util.HashMap;

public class NumberFun {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char[] characters = scanner.nextLine().toCharArray();
            HashMap<Character, Integer> cups = new HashMap<Character, Integer>() {
                {
		put('A', 1);
		put('B', 0);
                put('C', 0);
                }
            };
            for(char c : characters){
                switch(c){
                    case 'A':
                        if(cups.get('A').equals(1)){
                            cups.replace('A', 0);
                            cups.replace('B', 1);
                        } else if(cups.get('B').equals(1))
                            cups.replace('B', 0);
                            cups.replace('A', 1);
                        
                        break;
                    case 'B':
                        if(cups.get('B').equals(1)){
                            cups.replace('A', 1);
                            cups.replace('B', 0);
                        } else if(cups.get('A').equals(1))
                            cups.replace('B', 1);
                            cups.replace('A', 0);
                        break;
                    case 'C':
                        if(cups.get('C').equals(1)){
                            cups.replace('A', 1);
                            cups.replace('C', 0);
                        } else if(cups.get('A').equals(1))
                            cups.replace('C', 1);
                            cups.replace('A', 0);
                        break;
                }
            }
        }
}
