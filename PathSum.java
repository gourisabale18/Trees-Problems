/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class PathSum{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return helper(root,targetSum,0);
    }
    private boolean helper(TreeNode root,int targetSum, int currentSum)
    {
        if(root==null) return false;
        currentSum=currentSum+root.val;
        if(root.left==null && root.right==null)
        {
            if(currentSum==targetSum)
            {
                return true;
            }
        }
        if(helper(root.left,targetSum,currentSum) ||   helper(root.right,targetSum,currentSum))
        {
            return true;
        }
        return false;
    
    }
}