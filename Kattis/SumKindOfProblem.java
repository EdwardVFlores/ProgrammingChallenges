package programmingchallenges;

import java.util.Scanner;

public class SumKindOfProblem {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int P = scanner.nextInt();
            for(int i=0; i<P; i++){
                int K = scanner.nextInt();
                int N = scanner.nextInt();
                System.out.println(K + " " +sumOfPositives(N)+" "+sumOfNegatives(N)+" "+sumOfEvens(N));
            }
        }
        
        public static int sumOfPositives(int n){
            int an = 1 + (n-1)*1;
            double sn = ((1 + an)/2.0)*n;
            return (int)sn;
        }
        public static int sumOfNegatives(int n){
            int an = 1 + (n-1)*2;
            double sn = ((1+an)/2.0)*n;
            return (int)sn;
        }
        public static int sumOfEvens(int n){
            int an = 2 + (n-1)*2;
            double sn = ((2+an)/2.0)*n;
            return (int)sn;
        }

}
