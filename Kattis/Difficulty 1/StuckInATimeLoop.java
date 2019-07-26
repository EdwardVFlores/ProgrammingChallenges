package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/timeloop
 */

public class StuckInATimeLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int loop = input.nextInt();
        for(int i=1;i<=loop;i++){
            System.out.println(i + " Abracadabra");
        }
    }
}