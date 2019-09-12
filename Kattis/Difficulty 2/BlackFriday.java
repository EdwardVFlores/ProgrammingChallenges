package ProgrammingChallenges;

import java.io.*;
import java.util.*;

/**
 * @author Edward Flores Link: https://open.kattis.com/problems/blackfriday
 */
public class BlackFriday {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        HashMap<Integer, Integer> location = new HashMap<>();
        HashSet<Integer> contain = new HashSet<>();
        for (int i = 0; i < nums; i++) {
            int num = Integer.parseInt(in[i]);
            if (location.containsKey(num) && contain.contains(num)) {
                location.remove(num);
                continue;
            }
            if (!contain.contains(num))
                location.put(num, i + 1);
            contain.add(num);
        }
        int max = Integer.MIN_VALUE;
        for (int i : location.keySet())
            max = Math.max(max, i);
        System.out.println(location.get(max) == null ? "none" : location.get(max));
    }
}
