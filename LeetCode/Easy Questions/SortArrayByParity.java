package programmingchallenges;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/sort-array-by-parity/
 */

public class SortArrayByParity{
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,2,1,4})));
    }
    public static int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < A.length; i++){
            if(A[i]%2==0) list.addFirst(A[i]);
            else list.add(A[i]);
        }
        int[] newList = new int[A.length];
        for(int i = 0; i < A.length; i++) newList[i] = list.poll();
        return newList;
    }
}