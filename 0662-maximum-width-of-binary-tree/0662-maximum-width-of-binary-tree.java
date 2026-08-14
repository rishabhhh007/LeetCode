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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int maxl=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int s=q.peek().i;
            int e=0;
            for (int i=0;i<size;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                int idx=p.i;
                e=idx;

                if (node.left!=null) q.offer(new Pair(node.left,idx*2+1));
                if (node.right!=null) q.offer(new Pair(node.right,idx*2+2));
            }
            maxl=Math.max(maxl,e-s+1);
        }
        return maxl;
    }
}
class Pair{
    TreeNode node;
    int i;
    Pair(TreeNode node,int i){
        this.node=node;
        this.i=i;
    }
}