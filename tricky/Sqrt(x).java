Question: http://www.lintcode.com/en/problem/sqrtx/

//binary search
class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        long lo = 0;
        long hi = x;

        while (hi >= lo) {     
            long mid = lo+(hi-lo)/2;
            if (x < mid * mid) {
                hi = mid-1;      // not hi = mid
            } else {
                lo = mid+1;  
            }
        }
        return (int) hi;
    }
}
/********************************************************/
//Newton-Raphson method
class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x == 0){
            return 0;
        }
        long a =x;
        for (int i = 0; i < 100; i++){//I choose 100, while you can choose a different number 
            a = (a + x / a ) /2;//as the requirement of precision. Generally, more than 10 is good enough
        }
        return (int)a;
    }
}
