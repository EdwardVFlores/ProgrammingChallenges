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
        while(smallList.size()!=bigIntArr.length){
            smallList.add(0, 0);
        }
        int[] smallIntArr = new int[bigNum.length+1];
        for(int i=0;i<smallIntArr.length;i++){
            smallIntArr[i] = Integer.valueOf(smallList.get(i)+"");
        }
        
        //Addition process
        for(int i=bigIntArr.length-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                int carry = (bigIntArr[j] + smallIntArr[i])/10;
                bigIntArr[j] = (bigIntArr[j] + smallIntArr[i])%10;
                if(carry==0) break;
            }
        }
        
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