package programmingchallenges;
import java.util.Scanner;
public class Bijele {

    public static void main(String[] args) {
        
        int required[] = new int[]{1,1,2,2,2,8};
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<6;i++){
            System.out.print(required[i] - scanner.nextInt() + " ");
        }
        
    }
}
