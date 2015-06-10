Question: http://www.lintcode.com/en/problem/remove-element/
```
public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A == null){
            return 0;
        }
        int i = 0;
        int j = A.length - 1;
        while (i <= j){
            while (i <= j && A[i] != elem){
                i++;
            }
            while (i <= j && A[j] == elem){
                j--;
            }
            if (i <= j){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        }
        return i;
    }
}
```
