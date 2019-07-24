package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/encodedmessage
 */

public class EncodedMessage {
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numCases = input.nextInt();
        while(numCases>0){
            String msg = input.next();
            int squared = (int)Math.sqrt(msg.length());
            char[][] charTable = new char[squared][squared];
            int counter=0;
            for(int i=0; i<squared;i++){
                for(int j=0; j<squared; j++){
                    charTable[i][j] = msg.charAt(counter++);
                }
            }
            for(int i=squared-1; i>=0; i--){
                for(int j=0; j<squared; j++){
                    System.out.print(charTable[j][i]);
                }
            }
            System.out.println();
            numCases--;
        }
    }
}