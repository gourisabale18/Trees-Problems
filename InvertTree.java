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
class InvertTree{
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        //swap or invert action
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        //recurse
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }
}