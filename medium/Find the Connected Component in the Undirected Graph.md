Question: http://www.lintcode.com/en/problem/find-the-connected-component-in-the-undirected-graph/
```
/**
 * Definition for Undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param nodes a array of Undirected graph node
     * @return a connected set of a Undirected graph
     */
    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nodes == null || nodes.size() == 0){
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<UndirectedGraphNode> queue= new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode, Integer> map = new HashMap<UndirectedGraphNode, Integer>();
        for (UndirectedGraphNode node: nodes){
            if (map.containsKey(node)){
                continue;
            }
            list.clear();
            list.add(node.label);
            map.put(node, 1);
            queue.offer(node);
            while(!queue.isEmpty()){
                node = queue.poll();
                for (UndirectedGraphNode neighbor: node.neighbors){
                    if (!map.containsKey(neighbor)){
                        map.put(neighbor, 1);   
                        list.add(neighbor.label);
                        queue.offer(neighbor);   
                    }
                }
            }
            Collections.sort(list);
            result.add(new ArrayList<Integer>(list));
        }
        return result;
    }
}
```
