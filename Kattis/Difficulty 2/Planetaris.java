import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
*
* @author Edward Flores
* Link: https://open.kattis.com/problems/planetaris
*/
public class Planetaris {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numSystems = keyboard.nextInt(), numShips = keyboard.nextInt(), wins = 0;
        ArrayList<Integer> enemyShips = new ArrayList();
        for (int i = 0; i < numSystems; i++)
            enemyShips.add(keyboard.nextInt());

        Collections.sort(enemyShips);

        for (int element : enemyShips) {
            if (numShips > element) {
                numShips -= (element + 1);
                wins++;
            }
        }
        System.out.println(wins);
    }
}