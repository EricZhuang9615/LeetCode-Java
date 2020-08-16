package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EricZhuang
 * @Date 2020/8/16
 * Leetcode 133. Clone Graph
 */
public class CloneGraph {
    public Node cloneGraph(Node node){
        Node copyNode = new Node(node.val);
        List<Integer> visited = new ArrayList<Integer>();
        dfs(copyNode, node, visited);
        return copyNode;
    }

    public void dfs(Node copyNode, Node node, List<Integer> visited){

        visited.add(copyNode.val);

        List<Node> neighbors = node.neighbors;
        for(Node neighbor : neighbors){
            if(!visited.contains(neighbor.val)){
                Node temp = new Node(neighbor.val);
                copyNode.neighbors.add(temp);
                dfs(temp, neighbor, visited);
            }
        }
    }
}
