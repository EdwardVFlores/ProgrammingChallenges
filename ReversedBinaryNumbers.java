package programmingchallenges;

import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in));
        System.out.println(Integer.parseInt((new StringBuilder(Integer.toBinaryString(scanner.nextInt())).reverse()).toString(),2));
    }
}
