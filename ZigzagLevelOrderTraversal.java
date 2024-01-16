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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //Logic
        //consider root at level 0
        //if level is even, then add nodes to end of list
        //visually left to right
        //next nodes level will be 1 which is odd
        //when level is odd, add nodes to start of list
        //visually right to left
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean even=true;
        List<List<Integer>> olist=new LinkedList<>();
        if(root==null) return olist;
        List<Integer> ilist;
        while(!queue.isEmpty())
        {
           int size=queue.size();
           ilist=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                if(even)
                {
                    //add at end of list
                    ilist.add(node.val);
                }
                else
                {
                    //add at start of list
                    ilist.addFirst(node.val);
                }
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
            even=!even;
        }
        return olist;
    }
}