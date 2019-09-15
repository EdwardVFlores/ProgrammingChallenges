package ProgrammingChallenges;
import java.util.*;
import java.io.*;
public class Zamka {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int min = 38, max = 0;
        char nums[];
        for(int i = L; i <= D; i++){
            nums = (i + "").toCharArray();
            int sum = 0;
            for(char c : nums)  sum += (c-'0');
            if(sum == X) {
                min = i;
                break;
            }
        }
        System.out.println(min);
        for(int i = D; i >= L; i--){
            nums = (i + "").toCharArray();
            int sum = 0;
            for(char c : nums) sum += (c-'0');
            if(sum == X) {
                max = i;
                break;
            }
        }
        System.out.println(max);
    }
}
