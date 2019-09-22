package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingWorm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int inches = Integer.parseInt(input[0]), fall = Integer.parseInt(input[1]), height = Integer.parseInt(input[2]), location = 0;
        int ans = Math.max(0,(int)Math.ceil(height/(double)(inches-fall)) - 5);
        location = ans * (inches - fall);
        while(true){
            location += inches;
            ans++;
            if(location >= height) break;
            location -= fall;
        }
        System.out.println(ans);
    }
}
