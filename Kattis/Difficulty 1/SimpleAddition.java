package programmingchallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/simpleaddition
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
        ArrayList smallList = new ArrayList<>();
        int[] bigIntArr = new int[bigNum.length+1];
        bigIntArr[0] = 0;
        for(int i=1; i<bigIntArr.length; i++){
            bigIntArr[i] = bigNum[i-1]-'0';
        }
        for(char c : smallNum){
            smallList.add(c);
        }
        
        int[] smallIntArr = new int[smallList.size()];
        for(int i=0;i<smallIntArr.length;i++){
            smallIntArr[i] = Integer.valueOf(smallList.get(i)+"");
        }
        
        //Addition process
        
        // Okay time to just reverse the small number,
        // And use that for the reset of index for the big number,
        // Because I am starting to give up.
        
        //Print out
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
    }
}