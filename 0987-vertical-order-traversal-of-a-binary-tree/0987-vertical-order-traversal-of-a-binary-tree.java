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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer,ArrayList<Integer>> m=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            TreeMap<Integer, ArrayList<Integer>> temp = new TreeMap<>();
            for (int i=0;i<size;i++) {
                Pair p=q.poll();
                TreeNode node = p.node;
                int col = p.c;
                temp.putIfAbsent(col, new ArrayList<>());
                temp.get(col).add(node.val);

                if (node.left != null) {
                    q.offer(new Pair(node.left, col - 1));
                }
                if (node.right != null) {
                    q.offer(new Pair(node.right, col + 1));
                }
            }
            for (Map.Entry<Integer, ArrayList<Integer>> entry : temp.entrySet()) {
                ArrayList<Integer> list = entry.getValue();
                Collections.sort(list);
                m.putIfAbsent(entry.getKey(), new ArrayList<>());
                m.get(entry.getKey()).addAll(list);
            }
        }

        for(ArrayList<Integer> i:m.values()){
            ans.add(i);
        }

        return ans;
    } 
}

class Pair{
    TreeNode node;
    int c;
    Pair(TreeNode node,int c){
        this.node=node;
        this.c=c;
    }
}