Question: http://www.lintcode.com/en/problem/first-missing-positive/

Answer: http://www.cnblogs.com/AnnieKim/archive/2013/04/21/3034631.html
```
public class Solution {
    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here    
        if (A == null || A.length == 0){
            return 1;
        }
        int i = 0;
        int n = A.length;
        while (i < n){
            if (A[i] != i + 1 && A[i] > 0 && A[i] < (n + 1) && A[i] != A[A[i] - 1]){
                int tmp = A[i];
                A[i] = A[A[i] - 1];
                A[tmp - 1] = tmp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < n; j++){
            if (A[j] != j + 1){
                return j + 1;
            }
        }
        return n + 1;
    }
}
```
