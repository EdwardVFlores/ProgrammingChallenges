package programmingchallenges;

import java.util.Scanner;

public class Faktor {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = (int)scanner.nextInt() * (int)(scanner.nextInt() - 1);
        System.out.println(sum+1);
       
    }
    
}
