package programmingchallenges;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/tri
 */

public class Tri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt(), s = sc.nextInt(), t = sc.nextInt();
        if(f+s==t) System.out.printf("%d+%d=%d",f,s,t);
        else if(f-s==t) System.out.printf("%d-%d=%d",f,s,t);
        else if(f/s==t) System.out.printf("%d/%d=%d",f,s,t);
        else if(f*s==t) System.out.printf("%d*%d=%d",f,s,t);
        else if(f==s+t) System.out.printf("%d=%d+%d",f,s,t);
        else if(f==s-t) System.out.printf("%d=%d-%d",f,s,t);
        else if(f==s*t) System.out.printf("%d=%d*%d",f,s,t);
        else if(f==s/t) System.out.printf("%d=%d/%d",f,s,t);
    }
}