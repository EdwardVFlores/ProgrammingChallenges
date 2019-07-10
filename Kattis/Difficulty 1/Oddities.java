package programmingchallenges;

import java.util.Scanner;
public class Oddities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int numArray[] = new int[count];
        for(int i=0; i<count; i++){
            int numGiven = scanner.nextInt();
            numArray[i] = numGiven;
        }
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]%2==0)
                System.out.println(numArray[i] + " is even");
            else 
                System.out.println(numArray[i] + " is odd");
        }
    }
}
