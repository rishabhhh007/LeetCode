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
        List<List<Integer>> ans=new ArrayList();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int m=1;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                l.add(curr.val);

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(m%2==0){
                Collections.reverse(l);
                ans.add(l);
            }else{
                ans.add(l);
            }
            m++;
        }
        return ans;
    }
}