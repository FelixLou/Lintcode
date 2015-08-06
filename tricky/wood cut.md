Question: http://www.lintcode.com/en/problem/wood-cut/
```
public class Solution {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        if (L == null || L.length == 0){
            return 0;
        }
        int min = 1;
        long sum = 0;
        for (int i = 0; i < L.length; i++){
            sum += L[i];
        }
        if (k > sum){
            return 0;
        }
        int max = (int)(sum/k);
        while (min + 1 < max){
            int mid = (min + (max - min)/2);
            if (cutNum(L,mid) >= k){
                min = mid;
            }
            else {
                max = mid;
            }
        }
        if (cutNum(L,max) >= k){
            return max;
        }
        return min;
    }
    
    private int cutNum(int[] L, long mid){
        int sum = 0;
        for (int i = 0; i < L.length; i++){
            sum += L[i]/mid;
        }
        return sum;
    }
}
```
