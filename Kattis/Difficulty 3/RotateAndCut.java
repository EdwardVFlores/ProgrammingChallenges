package ProgrammingChallenges;
import java.io.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/rotatecut
 */
public class RotateAndCut {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++){
            String[] caseNum = br.readLine().split(" ");
            int numCuts = Integer.parseInt(caseNum[0]);
            StringBuilder sentence = new StringBuilder().append(caseNum[1]);
            for(int j = 0; j < numCuts; j++){
                int cutNumChars = sentence.length() / 4;
                if(cutNumChars == 0) break;
                if (j % 2 == 0) sentence.replace(0,cutNumChars,"");
                else sentence.replace(sentence.length() - cutNumChars,sentence.length(),"");
            }
            System.out.println(sentence.toString());
        }
    }
}