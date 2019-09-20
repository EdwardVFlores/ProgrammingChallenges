package ProgrammingChallenges;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/4thought
 */

public class FourThought {
    public static void main(String[] args){
        char[] op = {'*','/','+','-'};
        //int[] sums = new int[64];
        int[] ans = new int[]{256,16,68,60,16,1,8,0,32,17,24,16,0,15,16,8,16,1,8,0,0,0,4,-4,17,2,9,1,-15,0,1,-7,68,8,24,16,8,4,9,1,24,9,16,8,-8,7,8,0,-60,0,-8,-16,0,4,7,-1,16,1,8,0,-16,-1,0,-8};
        HashMap<Integer,String> hm = new HashMap<>();
        int counter = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    hm.put(ans[counter],"4 " + op[i] + " 4 " + op[j] + " 4 " + op[k] + " 4 = " + ans[counter++]);
                    //System.out.println("sums["+counter+++"] = 4 " + op[i] + " 4 " + op[j] + " 4 " + op[k] + " 4;");
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int num = sc.nextInt();
            System.out.println(hm.getOrDefault(num, "no solution"));
        }
    }
}
