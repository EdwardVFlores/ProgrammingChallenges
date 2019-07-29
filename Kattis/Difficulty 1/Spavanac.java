package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/spavanac
 */

public class Spavanac{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int totalMins = (input.nextInt()*60) + input.nextInt() - 45; // mins subtracted
        int mins = totalMins%60;
        int hours = totalMins/60;
        if(mins<0){
            mins += 60;
            if(hours == 0) hours = 23;
        }
        System.out.println(hours + " " + mins);
        input.close();
    }
}