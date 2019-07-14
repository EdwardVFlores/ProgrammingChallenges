package programmingchallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/simpleaddition
 * 1337
42
 */

public class SimpleAddition{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Determine small and big number
        char[] bigNum = input.nextLine().toCharArray();
        char[] smallNum = input.nextLine().toCharArray();
        if(bigNum.length<smallNum.length){
            char[] temp = bigNum;
            bigNum = smallNum;
            smallNum = temp;
        }
        int[] bigIntArr = new int[bigNum.length+1];
        bigIntArr[0] = 0;
        for(int i=0; i<bigNum.length; i++){
            bigIntArr[i+1] = bigNum[i]-'0';
        }
        int[] smallIntArr = new int[smallNum.length-1];
        for(char c : smallNum){
            smallIntArr[0] = Integer.valueOf(c + "");
        }
        for(int i:smallIntArr){
            System.out.println(i);
        }
        
        //Addition process
        
        // Okay time to just reverse the small number,
        // And use that for the reset of index for the big number,
        // Because I am starting to give up.
        
        /*Print out
        if(bigIntArr[0] == 0){
            for(int i=1; i<bigIntArr.length;i++){
                System.out.print(bigIntArr[i]);
            }
        }
        else{
            for(int i:bigIntArr){
                System.out.print(i);
            }
        }
        System.out.println();
        */
    }
}