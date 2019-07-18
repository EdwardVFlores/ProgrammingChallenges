package programmingchallenges;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/racingalphabet
 * 
 */

public class ProgrammingChallenges {
    public static void main(String[] args) throws InterruptedException{
        long startTime = new Date().getTime();
        
        TimeUnit.SECONDS.sleep(5);
    
        long elapsedTime = System.nanoTime();
        
        System.out.println((elapsedTime - startTime)/1000000);
    }
}