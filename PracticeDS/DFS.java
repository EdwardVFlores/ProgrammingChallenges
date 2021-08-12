import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Node {
    int value;
    Node left = null;
    Node right = null;
    Node(int value) {
        this.value = value;
    }
}

class DFS {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(9);
        Node n3 = new Node(12);
        Node n4 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        System.out.println(dfs(n1));
        
    }
    public static String dfs(Node n){
        Stack<Node> q = new Stack<Node>();
        q.add(n);
        while(!q.isEmpty()){
            
            Node curr = q.pop();
            if(curr.left != null) q.add(curr.left);
            
            System.out.println(curr.value);
            if(curr.right != null) q.add(curr.right);
        }
        return "";
    }
}
