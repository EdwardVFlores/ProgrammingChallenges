import java.util.*;

class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<Integer> list = new LinkedList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        if(root.left != null) inorderTraversal(root.left);
        list.add(root.val);
        if(root.right != null) inorderTraversal(root.right);
        return list;
    }
}