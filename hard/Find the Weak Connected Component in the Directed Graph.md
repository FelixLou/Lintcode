Question: http://www.lintcode.com/en/problem/find-the-weak-connected-component-in-the-directed-graph/
```
/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param nodes a array of Directed graph node
     * @return a connected set of a directed graph
     */
    classa UnionFind{
       HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();
 	   UnionFind(HashSet<Integer> hashSet){
			for(Integer now : hashSet) {
				father.put(now, now);
			}
		}      
		int find(int x){
		    int parent = father.get(x);
		    while (parent != father.get(parent)){
		        parent = father.get(parent);
		    }
		    return parent;
		}
		void union(int x, int y){
		    int faX = father.get(x);
		    int faY = father.get(y);
		    if (faX != faY){
		        father.put(faX, faY);
		    }
		}
		int compressed_find(int x){
		    int parent = father.get(x);
		    while (parent != father.get(parent)){
		        parent = father.get(parent);
		    }

		    int tmp = -1;
		    int fa = father.get(x);
		    while(fa != father.get(fa)){
		        tmp = father.get(fa);
		        father.put(fa, parent);
		        fa = tmp;
		    }
		    return parent;
		}
    }
    
	private List<List<Integer>>  print(HashSet<Integer> hashSet, UnionFind uf, int n) {
		List<List <Integer>> ans = new ArrayList<List<Integer>>();
        HashMap<Integer, List <Integer>> hashMap = new HashMap<Integer, List <Integer>>();
        for(int i : hashSet){
        	int fa = uf.find(i);
        	if(!hashMap.containsKey(fa)) {
        		hashMap.put(fa,  new ArrayList<Integer>() );
        	}
        	List <Integer> now =  hashMap.get(fa);
        	now.add(i);
        	hashMap.put(fa, now);
        }
        for( List <Integer> now: hashMap.values()) {
            Collections.sort(now);
        	ans.add(now);
        }
		return ans;
	}    
	
    public List<List<Integer>> connectedSet2(ArrayList<DirectedGraphNode> nodes) {
        // Write your code here
		HashSet<Integer> hashSet = new HashSet<Integer>(); 
		for(DirectedGraphNode now : nodes){
			hashSet.add(now.label);
			for(DirectedGraphNode neighbour : now.neighbors) {
				hashSet.add(neighbour.label);
			}
		}
		UnionFind uf = new UnionFind(hashSet);

        
		for(DirectedGraphNode now : nodes){
			
			for(DirectedGraphNode neighbour : now.neighbors) {
				int fnow = uf.find(now.label);
	        	int fneighbour = uf.find(neighbour.label);
	        	if(fnow!=fneighbour) {
	        		uf.union(now.label, neighbour.label);
	        	}
			}
		}
        
        
        return print(hashSet , uf, nodes.size());
        }
        
    }
}
```
