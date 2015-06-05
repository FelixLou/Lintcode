Question: http://www.lintcode.com/en/problem/divide-two-integers/
Complexity: 5
Solved by myself: No
/* We can keep subtract divisor from dividend until dividend is smaller than 0, than count the subtract numbers. 
But it will costs a very long time if the divisor is very small comparing to dividend.
Shift can be used to solve this problem. We shift the divisor left until it just smaller than dividend 
but if we keep shifting one more bit, it’s larger than dividend. Than we can add the shifted value to the result 
and subtract the shifted value from dividend. Keep doing this until dividend is smaller than divisor. 
In fact, every integer can be represented by a set of base 2 so that shifting can be used.
One thing needs to be mentioned is that we need to convert the integer to long type. 
Otherwise the Math.abs() value of Integer.MIN_VALUE will be quite strange.*/

public class Solution {
    /**
     * @param dividend the dividend
     * @param divisor the divisor
     * @return the result
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0){
            return dividend >= 0? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (dividend == 0){
            return 0;
        }
        if (dividend == -2147483648 && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean isNeg = (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0);
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int result = 0;
        while (a >= b){
            int shift = 0;
            while(a >= (b << shift)){
                shift++;
            }
            a -= b << (shift - 1);
            result += 1 << (shift - 1);
        }
        return isNeg? -result:result;
    }
}
