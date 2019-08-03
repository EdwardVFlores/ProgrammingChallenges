package programmingchallenges;

/**
 * @author Edward Flores
 * Link: https://leetcode.com/problems/distribute-candies-to-people/
 * 
 */

public class DistributeCandiesToPeople{
    public static void main(String[] args) throws Exception {
        for(int i : distributeCandies(60,4)){
            System.out.println(i);
        }
    }
    public static int[] distributeCandies(int candy, int people) {
        int[] arr = new int[people];
        for(int i=0; candy>0; candy -=i){
            arr[i%people] += Math.min(candy, ++i);
        }
        return arr;
    }
}