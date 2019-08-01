package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/sumoftheothers
 * 
 */

public class SumOfTheOthers{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            while(input.hasNext()){
                String[] nums = input.nextLine().split(" ");
                int sum = 0;
                for (String n : nums) {
                    sum += Integer.parseInt(n);
                }
            System.out.println(sum / 2);
        }
        input.close();
    }
}