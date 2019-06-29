package programmingchallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DRMMessages {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Map<Character, Integer> charMap = new HashMap<>();
            for(int i=0; i<characters.length();i++){
                charMap.put(characters.charAt(i),i);
            }
            String input = scanner.next();
            String firstHalf = input.substring(0,input.length()/2);
            String secondHalf = input.substring(input.length()/2,input.length());
            String[] strings = new String[]{firstHalf,secondHalf};
            int coun = 0;
            for(String string : strings){
                int sum = 0;
                char[] stringArray = string.toCharArray();
                for(char c : stringArray){
                    sum += charMap.get(c);
                }
                int counter = 0;
                String newString = "";
                for(char c : stringArray){
                    int finalPos = (charMap.get(c) + sum)%26;
                    stringArray[counter] = characters.charAt(finalPos);
                    newString += characters.charAt(finalPos);
                    counter++;
                }
                strings[coun] = newString;
                coun+=1;
            }
            for(int i=0; i<strings[0].length(); i++){
                System.out.print(characters.charAt((charMap.get(strings[0].charAt(i)) + charMap.get(strings[1].charAt(i)))%26));
            }
        }
}
