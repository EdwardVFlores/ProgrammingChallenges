package programmingchallenges;
import java.io.*;
import java.util.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/closestsums
 */

public class closestsums{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int integers = in.nextInt(), query = 0, counter=0;
        while(in.hasNext()){
            int[] numbers = new int[integers];
            for(int i = 0; i < integers; i++) numbers[i] = in.nextInt();
            Arrays.sort(numbers);
            query = in.nextInt();
            System.out.printf("Case %d:\n",++counter);
            for(int i = 0; i < query; i++){
                int high = integers-1, low = 0, queryNum = in.nextInt(), closest = Integer.MAX_VALUE, sum = 0;
                while(low < high){
                    if(Math.abs(numbers[high] + numbers[low] - queryNum) < closest){
                        closest = Math.abs(numbers[high] + numbers[low] - queryNum);
                        sum = numbers[high] + numbers[low];
                    }
                    if( numbers[high] + numbers[low] > queryNum) high--;
                    else low++;
                }
                System.out.printf("Closest sum to %d is %d.\n", queryNum, sum);
            }
            integers = in.nextInt();

        }
    }
}