package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/aprizenoonecanwin
 */
public class APrizeNoOneCanWin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        String[] secondLine = br.readLine().split(" ");
        int numPrices = Integer.parseInt(firstLine[0]), costLimit = Integer.parseInt(firstLine[1]);
        ArrayList<Integer> prices = new ArrayList<>();
        for(int i = 0; i < numPrices; i++) prices.add(Integer.parseInt(secondLine[i]));
        Collections.sort(prices);
        for(int i = numPrices - 1; i > 0; i--) if(prices.get(i) + prices.get(prices.size() - 2) > costLimit) prices.remove(prices.size() - 1);
        System.out.println(prices.size());
    }
}
