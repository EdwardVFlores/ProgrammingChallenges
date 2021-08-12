/*
    Problem: https://leetcode.com/problems/minimum-time-visiting-all-points/
*/

public class minimumTimeVisitingAllPoints {
    public static void main(String[] args){
        int[][] exPoints = new int[][]{{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(exPoints));
    }
    // Final Solution 
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length - 1; i++){
                ans += Math.max(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1]));
        }
        return ans;
    }

    /* First Solution
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length - 1; i++){
            for(int j = 0; j < points[i].length - 1; j++){
                ans += Math.max(Math.abs(points[i][j] - points[i+1][j]), Math.abs(points[i][j+1] - points[i+1][j+1]));
            }
        }
        return ans;
    }*/
}
