class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return res;
        if(root.left != null) postorderTraversal(root.left);
        if(root.right != null) postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}