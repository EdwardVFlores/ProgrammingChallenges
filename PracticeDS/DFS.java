import java.util.*;

/**
 * Version 2 of trying to implement DFS/BFS but searched up a video on how to do it.
 */

class Node {
    String value;
    Node left, right;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}


/**
 * Input
 *     a
 *    / \
 *   b   c
 *  /\  / \
 * d  e f  g
 *     / \
 *    h null
 * 
 * Output 
 * DFS: A -> B -> D -> E -> C -> F -> H -> G -> (Worked!)
 * BFS: A -> B -> C -> D -> E -> F -> G -> H -> (Worked!)
 * 
 */
public class DFS {
    public static void main(String[] args) {
        Node root = new Node("A", 
        new Node("B", new Node("D"), new Node("E")), 
        new Node("C",new Node("F", new Node("H"), null),new Node("G")));

        dfs(root); 
        System.out.println();
        bfs(root);
    }

    public static void dfs(Node root) {
        if(root == null) return;
        System.out.print(root.value + " -> ");
        if(root.left != null) dfs(root.left);
        if(root.right != null) dfs(root.right);
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            System.out.print(curr.value + " -> ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);

        }
    }
} 
