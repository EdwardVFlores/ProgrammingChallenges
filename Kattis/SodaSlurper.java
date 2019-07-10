package programmingchallenges;

import java.util.Scanner;

public class SodaSlurper {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
            int f = scanner.nextInt();
            int cost = scanner.nextInt();
            System.out.println(sodaDrink(e,f,cost));
            
        }
        
        public static int sodaDrink(int total, int remainder ,int cost){
            total = total + remainder;
            remainder = total % cost;
            if(total==cost) return 1;
            if(total<cost) return 0;            
            else{  
                return total/cost + sodaDrink(total/cost,remainder,cost);
            }
        }
        
}