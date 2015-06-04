Question: http://www.lintcode.com/en/problem/subsets-ii/
Answer:
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        if (S == null)
            return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
         ArrayList<Integer> list = new ArrayList<Integer>();
         Collections.sort(S);
        subsetsHelper(result, list, S, 0);
        return result;
    }
    private ArrayList<ArrayList<Integer>> subsetsHelper(
        ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, 
        ArrayList<Integer> S, int pos){
        
        result.add(new ArrayList<Integer>(list));
        for (int i = pos; i < S.size(); i++){
            if (i > 0 && i != pos && S.get(i) == S.get(i-1)){ //remove duplicates
                continue;
            }
            list.add(S.get(i));
            subsetsHelper(result, list, S, i+1);
            list.remove(list.size()-1);
        }
        return result;
            
        }
}
