package programmingchallenges;

import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/aboveaverage
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
            double avg = ((double)Grades/numGrades * 100);
            System.out.printf("%.3f", avg);
            System.out.println("%");
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
}