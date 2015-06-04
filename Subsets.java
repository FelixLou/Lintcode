Question: http://www.lintcode.com/submission/463489/

Answer:
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (S == null || S.size() == 0)
            return result;
          
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
            list.add(S.get(i));
            subsetsHelper(result, list, S, i+1);
            list.remove(list.size()-1);
        }
        return result;
            
        }
}
