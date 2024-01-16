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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> olist=new LinkedList<>();
        if(root==null) return olist;
        queue.add(root);
        List<Integer> ilist;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            ilist=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                ilist.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)

                {
                    queue.add(node.right);
                }
            }
            olist.add(ilist);
        }
        return olist;
    }
}