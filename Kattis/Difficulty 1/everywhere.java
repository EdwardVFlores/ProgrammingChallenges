package ProgrammingChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class everywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++){
            HashSet<String> places = new HashSet<>();
            int traveled = Integer.parseInt(br.readLine());
            for(int j = 0; j < traveled; j++){
                places.add(br.readLine());
            }
            System.out.println(places.size());
        }
    }
}
