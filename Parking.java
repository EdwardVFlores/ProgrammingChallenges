package programmingchallenges;

// https://open.kattis.com/problems/parking2

import java.util.Arrays;
import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while(testCases > 0){
            int numOfStores = input.nextInt();
            int[] storeLocations = new int[numOfStores]; 
            for(int i=0; i<numOfStores; i++){
                storeLocations[i] = input.nextInt();
            }
            Arrays.sort(storeLocations);
            System.out.println((storeLocations[storeLocations.length-1] - storeLocations[0])*2);
            testCases--;
        }
    }
}