package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/humancannonball2
 */

public class TheAmazingHumanCannonball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++){
            String[] input = br.readLine().split(" ");
            double angle = (Double.parseDouble(input[1])*Math.PI)/180.0;
            double time = Double.parseDouble(input[2])/(Double.parseDouble(input[0])*Math.cos(angle));
            double answer = (Double.parseDouble(input[0])*time*Math.sin(angle))-(4.905*(time*time));
            System.out.println((answer >= Double.parseDouble(input[3]) + 1.0 && answer <= Double.parseDouble(input[4]) - 1.0) ?"Safe":"Not Safe");
        }
    }
}
