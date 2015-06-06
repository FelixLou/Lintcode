public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public ArrayList<Integer> numbersByRecursion(int n) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
        if (n >= 0) {
            sub(n, res);
        }
        return res;
    }
    private int sub(int n, ArrayList<Integer> res) {
        if (n == 0) {
            return 1;
        }
        int base = sub(n - 1, res);
        int size = res.size();
        for (int i = 1; i <= 9; i++) {
            int curBase = i * base;
            res.add(curBase);
         
            for (int j = 0; j < size; j++) {
                res.add(curBase + res.get(j));
              
            }
        }
        return base * 10;
    }
}

