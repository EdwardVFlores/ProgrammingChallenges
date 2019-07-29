package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/vote
 */

public class PopularVote {
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numCases = input.nextInt();
        while(numCases>0){
            int contestants = input.nextInt();
            int total = 0;
            LinkedList<Integer> voteList = new LinkedList<>();
            HashMap<Integer, Integer> voteMap = new HashMap<>();
            for(int i=0; i<contestants; i++){
                int thisNum = input.nextInt();
                voteMap.put(thisNum,i+1);
                voteList.add(thisNum);
                total += thisNum;
            }
            Collections.sort(voteList);
            int lfirst = voteList.pollLast();
            int lsecond = voteList.pollLast();
            if(lfirst == lsecond) System.out.println("no winner");
            else if(!voteList.isEmpty() && lfirst == voteList.peekFirst()) System.out.println("no winner"); 
            else if (lfirst > total/2) System.out.println("majority winner " + voteMap.get(lfirst));
            else if (lfirst <= total/2) System.out.println("minority winner " + voteMap.get(lfirst));
            
            numCases--;
        }
    }
}
