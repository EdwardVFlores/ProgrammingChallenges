package programmingchallenges;
import java.io.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/bus
 * 
 */

public class Bus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++) System.out.println((int)Math.pow(2, Integer.parseInt(br.readLine())) - 1);
    }
}