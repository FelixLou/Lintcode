Question: http://www.lintcode.com/en/problem/flip-bits/
class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int c = a ^ b;
        int count = 0;
        for (int i = 0; i < 32; i++){
            if ((c & 1) == 1){
                count++;
            }
            c >>= 1;
        }
        return count;
    }
};
