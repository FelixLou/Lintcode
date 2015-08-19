Question: http://www.lintcode.com/en/problem/k-sum-ii/
```
public class Solution {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return a list of lists of integer 
     */ 
    public ArrayList<ArrayList<Integer>> kSumII(int[] A, int k, int target) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(A);
        helper(result, k ,target, A, list, 0);
        return result;
    }
    
    private void helper(ArrayList<ArrayList<Integer>> result, int k, int target,
                                int[] A, ArrayList<Integer> list, int pos){
        if (list.size() == k && target == 0){
            result.add( new ArrayList<Integer>(list));
        }
        for (int i = pos; i < A.length; i++){
            if (A[i] > target){
                break;
            }
            list.add(A[i]);
            helper(result, k, target - A[i], A, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
```
