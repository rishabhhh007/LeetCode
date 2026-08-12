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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> temp=new LinkedList<>();
        temp.offer(root);
        while(!temp.isEmpty()){
            int size=temp.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=temp.poll();
                l.add(curr.val);

                if(curr.left!=null){
                    temp.offer(curr.left);
                }
                if(curr.right!=null){
                    temp.offer(curr.right);
                }
            }
            ans.add(l);
        }
        return ans;

    }
}