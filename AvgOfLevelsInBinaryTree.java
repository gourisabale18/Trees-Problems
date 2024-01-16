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
    public List<Double> averageOfLevels(TreeNode root) {
        //avg values of nodes on each level is what we want
        //use queue in linked list implementation
        Queue<TreeNode> queue=new LinkedList<>();
        //add root node
        List<Double> list=new LinkedList<>();
        queue.add(root);
       // list.add(root.val);
        while(!queue.isEmpty())
        {
            double size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                sum=sum+node.val;

                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            list.add(sum/size);
        }
        return list;
    }
}