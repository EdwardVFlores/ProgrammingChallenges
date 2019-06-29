package programmingchallenges;

import java.util.Scanner;

public class JobExpenses {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sumPaid = 0;
            int numOfExpenses = scanner.nextInt();
            for(int i=0; i<numOfExpenses; i++){
                int num = scanner.nextInt();
                if(num<0) sumPaid+= Integer.parseInt(String.valueOf(num).substring(1));
            }
            System.out.println(sumPaid);
        }

}
