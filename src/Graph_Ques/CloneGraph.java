package Graph_Ques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> oldToNew = new HashMap<>();
        if(node == null) return null;
        return dfs(node,oldToNew);
    }

    private static Node dfs(Node node, Map<Node,Node> oldToNew){
        if(oldToNew.containsKey(node)){
            return oldToNew.get(node);
        }
        Node newNode = new Node(node.val);
        oldToNew.put(node,newNode);
        for(Node neighbor : node.neighbors){
            newNode.neighbors.add(dfs(neighbor,oldToNew));
        }
        return newNode;
    }
}
