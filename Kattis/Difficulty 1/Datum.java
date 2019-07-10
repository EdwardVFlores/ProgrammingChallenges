package programmingchallenges;

import java.util.Calendar;
import java.util.Scanner;

/*
Link to problem:
https://open.kattis.com/problems/datum
*/

public class Datum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int day = scanner.nextInt();
        int month = scanner.nextInt() - 1;
        calendar.set(2009, month, day);
        switch(calendar.get(Calendar.DAY_OF_WEEK)){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
        }
        
    }
}
