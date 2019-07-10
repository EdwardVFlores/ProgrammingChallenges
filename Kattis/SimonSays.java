package programmingchallenges;

import java.util.Scanner;


public class SimonSays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new StringBuilder(Integer.toBinaryString(scanner.nextInt())).reverse());
    }
}
