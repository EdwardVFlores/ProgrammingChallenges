package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/busnumbers2
 */
public class BusNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        ArrayList<Integer> cubedNums = new ArrayList<>();
        for(int i = 1; i < 74; i++){
            int cubedNum = (int)Math.pow(i,3);
            if(cubedNum > number) break;
            cubedNums.add(cubedNum);
        }
        HashSet<Integer> seen = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i = cubedNums.size() - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                int sum = cubedNums.get(i) + cubedNums.get(j);
                if(sum > number) break;
                if(seen.contains(sum)) max = Math.max(max,sum);
                else seen.add(sum);
            }
        }
        System.out.println(max != Integer.MIN_VALUE ? max : "none");
    }
}
