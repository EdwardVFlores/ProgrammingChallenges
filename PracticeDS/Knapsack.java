/**
    Knapsack problem
    Problem: Given a list of weights that has a price associated with those weights with a carrying capacity of 15 
    return the max price value that you can fit into that bag

    input = [[10,2], [5,3], [15,5], [7,7], [6,1], [18,4], [3,1]]
    output = [10,2], [15,5], [6,1], [18,4], [3,1]

    [x,y] -> x = profits, y = weights


    Solution: Time Complexity: O(nlogn) sorting the list of input/output
              Space Complexity: O(n) for each input stored a calculated value
              
              
*/

import java.util.*;
class Knapsack {
    public static void main(String[] args){
        ArrayList<int[]> input = new ArrayList<>();
        input.add(new int[]{10,2});
        input.add(new int[]{5,3});
        input.add(new int[]{15,5});
        input.add(new int[]{7,7});
        input.add(new int[]{6,1});
        input.add(new int[]{18,4});
        input.add(new int[]{3,1});
        
        List<int[]> answer = solution(input, 15);
        int i = 0;
        for(int[] list: answer) { // O(n)
            System.out.print("[");
            int j = 0;
            for(int nums:list) {
                System.out.print(nums+((j==1)?"":","));
                j++;
            }
            System.out.print("]"+((i==answer.size() - 1)?"":","));
            i++;
        }
    }

    static List<int[]> solution(ArrayList<int[]> nums, int carryWeight){
        List<double[]> pick = generateValues(nums);
        List<int[]> ans = new ArrayList<>();
        int currentWeight = 0;
        for(int i = pick.size() - 1; i >= 0; i--){ //O(n)
            for(int j = 1; j < 2; j++){
                int index = (int)pick.get(i)[1];
                currentWeight += nums.get(index)[1];
                if(currentWeight > carryWeight) break;
                ans.add(nums.get(index)); 
            }
        }
        return ans;
    }

    static List<double[]> generateValues(ArrayList<int[]> nums) {
        List<double[]> values = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){ // O(n)
            double[] vals = new double[2];
            vals[0] =  (double) nums.get(i)[0] / (double)nums.get(i)[1]; 
            vals[1] = i;
            values.add(vals); 
        }
        Collections.sort(values, Comparator.comparingDouble(o -> o[0])); // O(n log n)
        return values;
    }
}