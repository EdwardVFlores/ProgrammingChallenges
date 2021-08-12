import java.util.*;

public class TripleTexting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String sentence = scan.next();
        HashSet<String> set = new HashSet<String>();
        int lengthOfWord = sentence.length() / 3;
        String word = "";
        for(int i = 1; i <= 3; i++){
            int beg = i*lengthOfWord-lengthOfWord;
            int end = i*lengthOfWord;
            word = sentence.substring(beg, end);
            if(!set.add(word)){
                System.out.println(word);
                return;
            }
        }
        System.out.println(word);
    }
}
