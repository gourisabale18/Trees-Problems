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
class MaxDepth{
    public int maxDepth(TreeNode root) {
        
        //Max depth at current level would be
        // Max(maxDepOfLeftTree,maxDepOfRightTree) + 1(root/current level)
        if(root==null) return 0;
        int maxLeftDepth=maxDepth(root.left);
        int maxRightDepth=maxDepth(root.right);
        //cant change the order since we need left and right side values before returning the final depth
        return Math.max(maxLeftDepth,maxRightDepth)+1;

    }
}