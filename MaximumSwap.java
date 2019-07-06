package programmingchallenges;

// https://leetcode.com/problems/maximum-swap/

public class MaximumSwap {

        public static void main(String[] args) {
            System.out.println(maximumSwap(98368));
        }
        
        public static int maximumSwap(int num) {
        String numStr = Integer.toString(num);
        int[] intArr = new int[numStr.length()];
            for(int i=0; i<numStr.length();i++){
                intArr[i] = numStr.charAt(i) - '0';
            }
            int max=-1;
            int maxL=-1;
            for(int i=0; i<intArr.length-1; i++){
                
                for(int j=intArr.length-1; j>=i+1; j--){
                    if(intArr[i] < intArr[j] && max < intArr[j]){
                        max = intArr[j];
                        maxL = j;
                    }
                }
                if(max>-1){ 
                    int holder = intArr[i];
                    intArr[i] = intArr[maxL];
                    intArr[maxL] = holder;
                    break;
                }
            }
            
            String number = "";
            for(int i : intArr){
                number += i;
            }
            
            return Integer.parseInt(number);
        }
        
}