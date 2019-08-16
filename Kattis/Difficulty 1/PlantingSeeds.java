package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/plantingtrees
 */

public class PlantingSeeds {
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numTrees = input.nextInt();
        LinkedList<Integer> dayPlants = new LinkedList<>();
        for(int i=0; i<numTrees; i++){
            dayPlants.add(input.nextInt());
        }
        if(numTrees > (Collections.max(dayPlants) + 3)) System.out.println(numTrees + 2);
        else System.out.println(Collections.max(dayPlants) + 3);
       
    }
}