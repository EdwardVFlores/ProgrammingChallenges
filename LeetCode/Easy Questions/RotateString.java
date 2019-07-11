package programmingchallenges;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/rotate-string/
 */

public class RotateString{
    public static void main(String[] args){
        System.out.println(rotateString("abcde","cdeab"));   
    }
    public static boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        if(A.isEmpty() && B.isEmpty()) return true;
        LinkedList aArr = new LinkedList<>();
        LinkedList bArr = new LinkedList<>();
        for(char c : A.toCharArray()) {
            aArr.add(c);
        }
        for(char c : B.toCharArray()) {
            bArr.add(c);
        }
        for(int i=0; i<aArr.size(); i++){
            if(aArr.get(i).equals(bArr.get(i))){
                if(Arrays.equals(aArr.toArray(), bArr.toArray())) return true;
            }
            aArr.add(aArr.pop());
        }
        return false;
    }
}