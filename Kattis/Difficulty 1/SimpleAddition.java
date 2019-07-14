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
        int[] smallIntArr = new int[smallNum.length];
        for(int i=0; i<smallNum.length;i++){
            smallIntArr[i] = Integer.valueOf(smallNum[i] +"");
        }
        
        //Addition process
        int anchor=0;
        int carry=0;
        for(int i=smallNum.length-1; i>=0; i--){
            System.out.println(smallIntArr[i]);
            for(int j=bigNum.length - anchor ; j>=0; j--){
                
                
                //Goes in while loop
                
                if(j==0 && carry>0){
                    bigIntArr[j] += carry;
                    break;
                }
                //Ok now I think of logic in here...
                //I'm almost there.
                
               // System.out.println("i"+smallIntArr[i]);
              //  System.out.println("j"+bigIntArr[j]);
            }
            anchor++;
        }
        
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