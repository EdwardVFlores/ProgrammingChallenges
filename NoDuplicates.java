package programmingchallenges;

import java.util.Scanner;
import java.util.HashMap;

public class NoDuplicates {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] words = scanner.nextLine().split(" ");
            HashMap<String,String> wordMap = new HashMap<>();
            boolean hasno = false;
            for(String s:words){
                if(wordMap.containsKey(s)){
                    System.out.println("no");
                    hasno = true;
                    break;
                } else {
                    wordMap.put(s,"yes");
                }
            }
            if(hasno == false){
                System.out.println("yes");
            }
        }
}
