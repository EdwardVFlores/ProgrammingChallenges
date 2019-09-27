package ProgrammingChallenges;

import java.util.*;

public class grid {
        static boolean[][] visited;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int rows = scan.nextInt(), columns = scan.nextInt();
            scan.nextLine();
            int[][] grid = new int[rows][columns];
            for(int i = 0; i < rows; i++){
                char[] nums = scan.nextLine().toCharArray();
                for(int j = 0; j < columns; j++)
                    grid[i][j] = nums[j]  - '0';
            }

        public static void bfs(int source) {

            int i0 = source % width, j0 = source_/ width;
            visited[i0][j0] = true;
            Queue<> q = new LinkedList<>();
            q.add(source);
            while(!q.isEmpty()) {
                int u = q.poll();
                int i = u % width, j = u/ width;
                //cell value = 2
                //if statement for i + 2, j + 0 | i -2, j + 0, i + 0, j +2, ...
//                for(Node adj : n.adjacent) {
//                    if(!visited[adj.id]) {
//                        q.add(adj);
//                        visited[adj.id] = true;
//                    }
//                }
            }
        }
}
