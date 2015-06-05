Question: http://www.lintcode.com/en/problem/fibonacci/
//recursion cannot satisty the time limit
class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1){
            return 0;
        }
        int n1 = 0;
        int n2 = 1;
        for (int i = 3; i <= n; i++){
            int tmp = n2;
            n2 = n1 + n2;
            n1 = tmp;
        }
        return n2;
    }
}
