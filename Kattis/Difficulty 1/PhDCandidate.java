package programmingchallenges;

import java.util.Scanner;

public class PhDCandidate {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            System.out.println(fact(input));
            
        }
        
        public static int fact(int input){
            if(input<=1) return 1;
            else{
                return input * fact(input);
            }
        }
}