package programmingchallenges;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/sortofsorting 
 */

public class SortOfSorting{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numNames = in.nextInt();
        while (numNames != 0){
            HashMap<String, ArrayList> firstChars = new HashMap<>();
            
            for(int i = 0; i < numNames; i++){
                String name = in.next();
                String key = name.substring(0,2);
                if(firstChars.containsKey(key)){
                    firstChars.get(key).add(name);
                } else {
                    ArrayList<String> names = new ArrayList();
                    names.add(name);
                    firstChars.put(key, names);
                }
            }
            ArrayList<String> keys = new ArrayList<>();
            for(String s : firstChars.keySet()){
                keys.add(s);
            }
            Collections.sort(keys);
            for(String s : keys){
                for (Object al : firstChars.get(s)) {
                    System.out.println(al);
                }
            }
            numNames = in.nextInt();
            if(numNames > 0) System.out.println();
        }
    }
}