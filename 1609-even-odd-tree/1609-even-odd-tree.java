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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(level%2==0){
                    if(curr.val%2!=1) return false;
                    if(curr.val<=max) return false;
                    max=curr.val;
                }else{     
                    if(curr.val%2!=0) return false;
                    if(curr.val>=min) return false;
                    min=curr.val;
                }

                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            level++;
        }
        return true;
    }
}