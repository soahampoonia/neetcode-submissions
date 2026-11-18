/*
Definition for a Node.
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
    HashMap<Node, Node> map;
    public Node cloneGraph(Node node) {
        this.map = new HashMap<>();

        if (node == null) return null;
        
        return clone(node);
    }

    public Node clone(Node curr) {

        if (curr == null) return null;

        Node copy = null;

        if (map.containsKey(curr)) {
            return map.get(curr);
        } else {
            copy = new Node(curr.val);
            map.put(curr, copy);
        }

        for (Node neighbor : curr.neighbors) {
            copy.neighbors.add(clone(neighbor));
        }
        return copy;
    }
}