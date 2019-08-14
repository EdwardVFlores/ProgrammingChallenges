package programmingchallenges;
import java.util.Scanner;
/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/piglatin
 */

public class PigLatin{
    public static boolean isVowel(char n) {
	return n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'y';
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextLine()){
	String[] words = scan.nextLine().split(" ");
	for (int i = 0; i < words.length; i++){
	String word = words[i];
	if (!isVowel(word.charAt(0))){
            while (!isVowel(word.charAt(0))) word = word.substring(1, word.length()) + word.substring(0 , 1);
		System.out.print(word + "ay ");
		}
        else System.out.print(word + "yay ");
	}
	System.out.println();
	}
    }
}