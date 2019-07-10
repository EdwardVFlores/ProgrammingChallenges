package programmingchallenges;

import java.util.Scanner;

/*
Link to problem:
https://open.kattis.com/problems/hissingmicrophone
*/

public class HissingMicrophone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] letters = input.toCharArray();
        String hiss = "no hiss";
        for(int i=0; i<input.length() - 1; i++){ 
            if(letters[i] == 's'){
                if(letters[i+1] == 's'){
                    hiss = "hiss";
                    break;
                }
            }
        }
        System.out.println(hiss);
    }
}
