package programmingchallenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/anewalphabet
 */

public class ANewAlphabet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        HashMap<Character, String> newAlphabet = new HashMap<>();
        newAlphabet.put('a', "@");
        newAlphabet.put('b', "8");
        newAlphabet.put('c', "(");
        newAlphabet.put('d', "|)");
        newAlphabet.put('e', "3");
        newAlphabet.put('f', "#");
        newAlphabet.put('g', "6");
        newAlphabet.put('h', "[-]");
        newAlphabet.put('i', "|");
        newAlphabet.put('j', "_|");
        newAlphabet.put('k', "|<");
        newAlphabet.put('l', "1");
        newAlphabet.put('m', "[]\\/[]");
        newAlphabet.put('n', "[]\\[]");
        newAlphabet.put('o', "0");
        newAlphabet.put('p', "|D");
        newAlphabet.put('q', "(,)");
        newAlphabet.put('r', "|Z");
        newAlphabet.put('s', "$");
        newAlphabet.put('t', "']['");
        newAlphabet.put('u', "|_|");
        newAlphabet.put('v', "\\/");
        newAlphabet.put('w', "\\/\\/");
        newAlphabet.put('x', "}{");
        newAlphabet.put('y', "`/");
        newAlphabet.put('z', "2");
        for(int i = 0; i < input.length(); i++){
            if(newAlphabet.containsKey(input.charAt(i))) 
                System.out.print(newAlphabet.get(input.charAt(i)));
            else System.out.print(input.charAt(i));
        }
    }
}
