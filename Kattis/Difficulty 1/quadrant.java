package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/quadrant
 */

public class quadrant{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int fn = input.nextInt();
        int sn = input.nextInt();
        boolean x=true,y=true;
        if(fn<0) x=false;
        if(sn<0) y=false;
        if(x&&y)System.out.println("1");
        else if(x&&!y)System.out.println("4");
        else if(!x&&y)System.out.println("2");
        else if(!x&&!y)System.out.println("3");
    }
}