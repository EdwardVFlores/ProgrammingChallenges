package programmingchallenges;

import java.util.Scanner;

/*
Link to problem:
https://open.kattis.com/problems/lastfactorialdigit
*/

public class LastFactorialDigit {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numOfTimes = scanner.nextInt();
            while(numOfTimes>0){
            int input = scanner.nextInt();
            int answer = fact(input);
            String hi = String.valueOf(answer);
            System.out.println(hi.charAt(hi.length()-1));
            numOfTimes--;
            }
            
        }
        
        public static int fact(int input){
            if(input<=1) return 1;
            else{
                return input * fact(input-1);
            }
        }
}
