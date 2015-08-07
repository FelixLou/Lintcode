Question: http://www.lintcode.com/en/problem/update-bits/

```
class Solution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    int updateBits(int n, int m, int i, int j) {
        int mask;
        if (j < 31) {
            mask = ~((1 << (j + 1)) - (1 << i));
        } else {
            mask = (1 << i) - 1;
        }
        return (m << i) + (mask & n);
    }
}
```
My solution 
```
class Solution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        // write your code here
        int oo = 0;
        for (int a = i; a <= j; a++){
            oo += 1 << a;
        }
        int ll = ~oo;
        n = n & ll; // set i - j to 0
        m = m << i;
        return n | m;
        
    }
}
```
