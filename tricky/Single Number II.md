Question: http://www.lintcode.com/en/problem/single-number-ii/
```
public class Solution {
	/**
	 * @param A : An integer array
	 * @return : An integer 
	 */
    public int singleNumberII(int[] A) {
        // write your code here
        if (A == null || A.length == 0){
            return -1;
        }
        int result = 0;
        int[] bits = new int[32];
        for (int i = 0 ; i < 32; i++){
            for (int j = 0; j < A.length; j++){
                bits[i] += A[j] >> i & 1;
                bits[i] %= 3;
            }
             
            result |= (bits[i] << i);
        }
        return result;
    }
}
```
