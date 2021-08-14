import java.util.ArrayList;
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
        ArrayList<Node> res = new ArrayList<>();
        DFS(root,res);
        for(Node n : res){
            System.out.println(n.val);
        }
    } 

    static void DFS(Node root, ArrayList<Node> res){
        if(root == null) DFS(root, res);
        if(root.left != null) DFS(root.left, res);
        res.add(root);
        if(root.right != null) DFS(root.right,res);
    }
}