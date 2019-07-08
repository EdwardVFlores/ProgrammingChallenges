package programmingchallenges;

import java.util.Scanner;
import java.util.HashMap;

public class Trik {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
            int f = scanner.nextInt();
            System.out.println(sodaCount((e+f), scanner.nextInt()));
        }
        
        public static int sodaCount(int total, int cost){
            if(total == 1) return 1;
            else return total/2 + sodaCount(total/2,cost);
        }
}