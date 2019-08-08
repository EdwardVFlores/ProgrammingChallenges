package programmingchallenges;
import java.util.Scanner;
import java.util.HashSet;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/engineeringenglish 
 */

public class EngineeringEnglish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       HashSet<String> set  = new HashSet<>();
       StringBuilder sb = new StringBuilder();
       while(sc.hasNext()){
           String word = sc.next();
           if(set.contains(word.toLowerCase())){
               sb.append(". ");
           } else {
               sb.append(word).append(" ");
               set.add(word.toLowerCase());
           }
       }
        System.out.println(sb.toString().substring(0, sb.length()-1));
    }
}