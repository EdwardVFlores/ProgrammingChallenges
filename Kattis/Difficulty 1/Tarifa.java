package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/tarifa
 */

public class Tarifa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int megabytes = Integer.parseInt(br.readLine());
        int months = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < months; i++) sum += Integer.parseInt(br.readLine());
        System.out.println(months * megabytes - sum + megabytes);
    }
}
