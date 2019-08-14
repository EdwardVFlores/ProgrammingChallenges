package programmingchallenges;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/simon
 */

public class SimonSays{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();
        for(int i = 0; i < testCases; i++){
            String[] command = in.nextLine().split(" ");
            if(command.length > 2 && command[0].equals("simon") && command[1].equals("says")) {
                StringBuilder sb = new StringBuilder();
                for(int j=2; j<command.length-1; j++) sb.append(command[j]).append(" ");
                sb.append(command[command.length]);
                System.out.println(sb.toString());
            } else System.out.println();
        }
    }
}