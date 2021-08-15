import java.util.*;
class DFS {

    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5, 
        new Node(10, new Node(20), new Node(8)), 
        new Node(7, new Node(30), new Node(14)));
        ArrayList<Node> dfsRes = new ArrayList<>();
        ArrayList<Node> bfsRes = new ArrayList<>();
        DFS(root,dfsRes);
        for(Node n : dfsRes){
            System.out.println(n.val);
        }
        System.out.println("");
        BFS(root,bfsRes);
        for(Node n : bfsRes){
            System.out.println(n.val);
        }

    } 

    static void DFS(Node root, ArrayList<Node> res){
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
            res.add(curr);
        }
        
    }

    static void BFS(Node root, ArrayList<Node>res){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node cur = q.remove();
            res.add(cur);
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
            
        }
    }
}