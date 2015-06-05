class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if (n < 0){
            return -1;
        }
        long result = 0;
        for (long i = 5; n >= i; i *= 5){
            result += n/i;
        }
        return result;
    }
};
