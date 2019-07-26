package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/qaly
 */

public class qaly{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int nums = input.nextInt();
        double total = 0;
        for(int i=0; i<nums; i++){
            total += input.nextDouble() * input.nextDouble();
        }
        System.out.println(total);
    }
}