package programmingchallenges;
import java.io.*;
/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/different
 */
public class ADifferentProblem{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            String[] nums = line.split(" ");
            System.out.println(Math.abs(Long.parseLong(nums[0])-Long.parseLong(nums[1])));
        }
    }
}