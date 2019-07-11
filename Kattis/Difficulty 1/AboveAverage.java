package programmingchallenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/aboveaverage
 * 5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
7 100 95 90 80 70 60 50
3 10 25 33
9 100 99 20 97 96 95 94 93 91
 */

public class AboveAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while(testCases > 0){
            int numGrades = input.nextInt();
            int[] gradeList = new int[numGrades];
            for(int i=0; i<numGrades; i++){
                gradeList[i] = input.nextInt();
            }
            int Grades = numGradesHigherThanAvg(gradeList,getAverageFromList(gradeList));
            String avg = ((double)Grades/numGrades +"");
            while(avg.length()<8){
                avg+='0';
            }
            ArrayList avgList = new ArrayList<>();
            for(int i=0; i<8; i++){
                avgList.add(avg.charAt(i));
            }
            ArrayList ans = roundUp(avgList, avgList.size()-1);
            for(Object o : ans){
                System.out.print(o);
            }
            System.out.println();
            testCases--;
        }
    }
    
    public static double getAverageFromList(int[] list){
        int total = 0;
        for(int num : list){
            total += num;
        }
        return (double)total/list.length;
    }
    
    public static int numGradesHigherThanAvg(int[] list, double avg){
        int total = 0;
        for(int num : list){
            if(num>avg) total++;
        }
        return total;
    }
    
    public static ArrayList roundUp(ArrayList l,int pointer){
        int carry = 0;
        int curr = Integer.valueOf(l.get(pointer)+"");
        int next = Integer.valueOf(l.get(pointer-1)+"");
        if(next==0){
            l.set(0, 1);
            return l;
        }
        else if(curr<9) {
            l.set(curr, 1);
            return l;
        }
        else{
            pointer--;
            return roundUp(l,pointer);
        }
    }
}