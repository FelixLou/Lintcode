Question: http://www.lintcode.com/en/problem/climbing-stairs/
//consider the two choices of last step, add them together.
public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        //state 
        //distinct ways to get ways[i]
        if (n == 1){
            return 1;
        }
        int[] ways = new int[n];
        //initialize 
        ways[0] = 1;
        ways[1] = 2;
        //trans-function
        for (int i = 2; i < n; i++){
             ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n - 1];
        
    }
}
