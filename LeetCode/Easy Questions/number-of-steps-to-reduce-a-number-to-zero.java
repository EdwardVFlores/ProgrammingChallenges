class Solution {
    public int numberOfSteps (int num) {
        //Iterative Design O(n) Uses more memory than recursive design but a little bit faster compared to O(2n)
        int counter = 0;
        while(num != 0){
            num = (num%2 == 0)? num / 2 : --num;
            counter++;
        }
       return counter;
        /** Recursive Design O(2n) -> O(n) Uses less memory than iterative design
        if(num==0) return 0;
        return (num%2==0) ? numberOfSteps(num/2) + 1 : numberOfSteps(num-1) + 1;
        */
    }
}