package ICPC2019;
import java.util.*;

/**
 * @author Edward Flores
 */
public class MissingNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int start = 1, num;
        boolean good = true;
        for(int i = 0; i < testCases; i++) {
            num = scan.nextInt();
            while(start != ++num) {
                System.out.println(start++);
                good = false;
            }
        }
        if(good) System.out.println("good job");
    }
}
