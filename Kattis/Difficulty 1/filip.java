package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/filip
 */

public class filip{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder fn = new StringBuilder(String.valueOf(input.nextInt()));
        StringBuilder sn = new StringBuilder(String.valueOf(input.nextInt()));
        int fnr = Integer.parseInt(fn.reverse().toString());
        int snr = Integer.parseInt(sn.reverse().toString());
        if(fnr>snr)System.out.println(fnr);
        else System.out.println(snr);
    }
}