Question: http://www.lintcode.com/en/problem/product-of-array-exclude-itself/

Scan from left and right, then * together
```
public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> result = new ArrayList<Long>();
        if (A == null || A.size() == 0){
            return result;
        }
        if (A.size() == 1){
            result.add(1L);
            return result;
        }
        //left
        int size = A.size();
        long[] left = new long[size];
        long product = 1L;
        left[0] = 1;
        for (int i = 1; i < size; i++){
            product *= A.get(i - 1);
            left[i] = product;
        }  
        
        long[] right = new long[size];
        product = 1L;
        right[size - 1] = 1L;
        for (int i = size - 2; i >= 0; i--){
            product *= A.get(i + 1);
            right[i] = product;
        }  
        for (int i = 0; i < size; i++){
            result.add(left[i] * right[i]);
        }
        return result;
    }
}
```
