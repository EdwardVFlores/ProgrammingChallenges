package programmingchallenges;
import java.io.*;
import java.math.BigInteger;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/nine
 * 
 */

public class Nine {
    
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BigInteger nine = new BigInteger("9");
        BigInteger eight = new BigInteger("8");
        BigInteger bigMod = new BigInteger("1000000007");
        int testcases = Integer.parseInt(sc.readLine());
        for(int i = 0; i < testcases; i++){
            BigInteger x = new BigInteger(sc.readLine());
            BigInteger ans = eight.multiply(nine.modPow(x.subtract(BigInteger.ONE), bigMod));
            System.out.println(ans.mod(bigMod));
        }
    }
}