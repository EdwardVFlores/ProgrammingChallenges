package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/guess
 * Description: Binary Search Problem
 */

public class Guess{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int low = 1, high = 1000, middle = 500;
        System.out.println(middle);
        for(int i = 0; i < 9; i++){
            String hint = br.readLine();
            if(hint.equals("lower")) high = --middle;
            else if(hint.equals("higher")) low = ++middle;
            else break;
            System.out.println(middle = (low + high) / 2);
        }
        br.close();
    }
}
