package programmingchallenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/weightofwords
 */

public class WeightOfWords{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine()) != null){
            String[] in = input.split(" ");
            int length = Integer.valueOf(in[0]), weight = Integer.valueOf(in[1]);
            int remainder, value;
            int[] values;
            String letters = "abcdefghijklmnopqrstuvwxyz"; //subtract 1 with values
            if(weight / length < 1 || length * 26 < weight) System.out.println("impossible");
            else {
                values = new int[length];
                remainder = weight % length;
                for(int i = 0; i < values.length; i++){
                    values[i] = weight/length; 
                    if(remainder != 0){
                        value = values[i] + remainder;
                        if(value > 26){
                            if(remainder !=0) remainder = (value)%26; 
                            values[i] = 26;
                            System.out.print(letters.charAt(values[i]-1));
                        }
                        else if(value <= 26){
                            values[i] += remainder;
                            remainder = 0;
                            System.out.print(letters.charAt(values[i]-1));
                        }
                    }
                    else System.out.print(letters.charAt((values[i]-1)));
                }
                System.out.println();
            }
        }
    }
}