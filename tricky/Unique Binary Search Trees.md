Question: http://www.lintcode.com/en/problem/unique-binary-search-trees/

Answer: http://fisherlei.blogspot.com/2013/03/leetcode-unique-binary-search-trees.html
```
public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        int[] count = new int[n+2];
        count[0] = 1;
        count[1] = 1;
        
        for(int i=2;  i<= n; i++){
            for(int j=0; j<i; j++){
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
    
}
```
