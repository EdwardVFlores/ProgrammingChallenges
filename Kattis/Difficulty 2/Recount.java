package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/recount
 */

public class Recount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        HashMap<String, Integer> names = new HashMap<>();
        HashMap<Integer, String> numberName = new HashMap<>();
        while(!(input = br.readLine()).equals("***")){
            names.put(input,names.getOrDefault(input,0) + 1);
            numberName.put(names.getOrDefault(input,0) + 1,input);
        }
        int[] numbers = new int[names.size()];
        int counter=0;
        for(Object i :names.keySet().toArray()){
            numbers[counter++] = names.get(i.toString());
        }
        Arrays.sort(numbers);
        if(numbers[numbers.length-1] == numbers[numbers.length - 2]) {
            System.out.println("Runoff!");
            System.exit(0);
        }
        else System.out.println(numberName.get(numbers[numbers.length-1]));
    }
}
