/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node,Node> visited=new HashMap<>();
        Node nn=new Node(node.val);
        Queue<Node> q=new ArrayDeque<>();
        visited.put(node,nn);
        q.offer(node);

        while(!q.isEmpty()){
            Node curr=q.poll();
            for(Node n:curr.neighbors){
                if (!visited.containsKey(n)) {
                    visited.put(n, new Node(n.val));
                    q.offer(n);
                }
                visited.get(curr).neighbors.add(visited.get(n));
            }

        }
        return nn;

    }
}