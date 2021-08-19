/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorderRecursive(Node root) {
        if(root == null) return res;
        for(Node child: root.children) postorder(child);
        res.add(root.val);
        return res;
    }

    public List<Integer> postorderIterative(Node root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            res.add(root.val);
            for(int i = 0; i < root.children.size(); i++){
                stack.add(root.children.get(i));
                
            }
        }
        Collections.reverse(res);
        return res;
    }
}