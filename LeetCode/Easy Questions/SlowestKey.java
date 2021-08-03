import java.util.*;

// https://leetcode.com/problems/slowest-key/

public class SlowestKey {
    public static void main(String[] args){
        int[] ex1 = new int[] {9,29,49,50};
        String strEx1 = "cbcd";
        System.out.println(slowestKey(ex1,strEx1));
        
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap <Integer, ArrayList<Character>> hm = new HashMap <Integer, ArrayList<Character>>(); 
        ArrayList<Character> characterValues = new ArrayList<>();
        characterValues.add(keysPressed.charAt(0));
        hm.put(releaseTimes[0],characterValues); //don't put in the loop
        int maxValue = releaseTimes[0];
        //read thru the releasedTimes
        for (int i=1; i< releaseTimes.length; i++){
            int key = releaseTimes[i]-releaseTimes[i-1];
            maxValue = Math.max(maxValue,key);
            if(hm.containsKey(key)){
                hm.get(key).add(keysPressed.charAt(i));
            } else {
                characterValues = new ArrayList<>();
                characterValues.add(keysPressed.charAt(i));
                hm.put(key,characterValues);
            }
        }
        char small = hm.get(maxValue).get(0);
        for(char c : hm.get(maxValue)) {
            if(c-'a' > small-'a') small = c;
        }
        return small;
    }
}
