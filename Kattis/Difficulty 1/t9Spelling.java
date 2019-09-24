package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class t9Spelling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        HashMap<Character, String> letters = new HashMap<>();
        int[] charList = new int[] {2,3,4,5,6,7,8,9};
        letters.put('a',"2");
        letters.put('b',"22");
        letters.put('c',"222");
        letters.put('d',"3");
        letters.put('e',"33");
        letters.put('f',"333");
        letters.put('g',"4");
        letters.put('h',"44");
        letters.put('i',"444");
        letters.put('j',"5");
        letters.put('k',"55");
        letters.put('l',"555");
        letters.put('m',"6");
        letters.put('n',"66");
        letters.put('o',"666");
        letters.put('p',"7");
        letters.put('q',"77");
        letters.put('r',"777");
        letters.put('s',"7777");
        letters.put('t',"8");
        letters.put('u',"88");
        letters.put('v',"888");
        letters.put('w',"9");
        letters.put('x',"99");
        letters.put('y',"999");
        letters.put('z',"9999");
        letters.put('0',"0");
        letters.put(' ',"0 ");
        for(int i = 1;  i <= cases; i++){
            char[] word = br.readLine().toCharArray();
            System.out.print("Case #" + i + ": ");
            char lastChar = ';';
            for(char c : word) {
                if(letters.get(c).charAt(0) == ' ') System.out.print(" ");
                else if(letters.get(c).charAt(0) == lastChar) {
                    System.out.print(" " + letters.get(c));
                }
                else System.out.print(letters.get(c));
                if(c != ' ') lastChar = letters.get(c).charAt(0);
            }
            System.out.println();
        }
    }
}
