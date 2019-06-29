package programmingchallenges;

import java.util.Scanner;
import java.util.Arrays;
public class Ladder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
        char[] letters = input.toCharArray();
        String hiss = "";
        
        for(int i=0; i<input.length(); i++){
            System.out.println(letters[i]);
            /*
            if(letters[i] == 's'){
                if(letters[i++] == 's'){
                    hiss = "hiss";
                    break;
                } else{
                    hiss = "no hiss";
                }
            }
                    */
        }
        System.out.println(hiss);
    }
}
