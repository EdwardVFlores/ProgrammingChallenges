package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/autori
 */

public class autori{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        for(char c : input.next().toCharArray()){
            if(Character.isUpperCase(c)) System.out.print(c);
        }
    }
}