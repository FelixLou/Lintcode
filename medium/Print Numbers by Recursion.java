Question: http://www.lintcode.com/en/problem/print-numbers-by-recursion/
public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public ArrayList<Integer> numbersByRecursion(int n) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
        if (n < 0){
           return res;  
        }
        helper(res, n);
        return res;
    }
    private int helper(ArrayList<Integer> res, int n){
        if (n == 0){
            return 1;
        }
        int base = helper(res,n - 1);
        int size = res.size();
        for (int i = 1; i <= 9; i++){
            res.add(i * base);
            for (int j = 0; j < size; j++){
                res.add(i * base + res.get(j));
            }
        }
        return 10 * base;
    }

}
