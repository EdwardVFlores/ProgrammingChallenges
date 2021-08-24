class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        HashMap<Integer, ArrayList<Integer>> res = new HashMap<Integer, ArrayList<Integer>>();
        int depth = 0;
        dfs(root, res, depth);
        Double sum;
        for(int i = 0; i < res.size(); i++){
            sum = 0.0;
            for(int num:res.get(i)){
                sum += num;
            }
            ans.add(sum/res.get(i).size());
        }
        return ans;
    }
    
    public int dfs(TreeNode root, HashMap<Integer, ArrayList<Integer>> res, int depth) {
        if(root == null) return 0;
        if(res.containsKey(depth)) {
            res.get(depth).add(root.val);
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.val);
            res.put(depth, al);
        }
        if(root.left != null) depth += dfs(root.left, res, depth + 1);       
        if(root.right != null) depth += dfs(root.right, res, depth + 1);
        
        return 0;
    }
}