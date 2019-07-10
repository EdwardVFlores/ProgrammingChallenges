package programmingchallenges;

import java.util.LinkedList;
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
            String avg = ((double)Grades/numGrades +"");
            while(avg.length()<8){
                avg+='0';
            }
            LinkedList avgList = new LinkedList<>();
            for(int i=0; i<8; i++){
                avgList.add(avg.charAt(i));
            }
            avgList.add(4,'.');
            avgList.remove(1);
            if(Integer.valueOf(avgList.get(7)+"") >=5){
                avgList.add(6, Integer.valueOf(avgList.get(6)+"") +1);
                avgList.removeLast();
                avgList.removeLast();
            } else avgList.removeLast();
            
            avgList.add('%');
            if(Integer.valueOf(avgList.get(0)+"") <1) avgList.removeFirst();
            Object[] ans = avgList.stream().toArray();
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
    
}