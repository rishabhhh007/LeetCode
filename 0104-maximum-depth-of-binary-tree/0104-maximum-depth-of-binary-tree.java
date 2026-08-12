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
    public int maxDepth(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        Queue<TreeNode> temp=new LinkedList<>();
        temp.offer(root);
        while(!temp.isEmpty()){
            int s=temp.size();
            for(int i=0;i<s;i++){
                TreeNode curr=temp.poll();
                if(curr.left!=null) temp.offer(curr.left);
                if(curr.right!=null) temp.offer(curr.right);
            }
            ans++;
        }
        return ans;
    }
}