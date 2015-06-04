Question: http://www.lintcode.com/en/problem/unique-binary-search-trees/
public class Solution {
/*
The case for 3 elements example
Count[3] = Count[0]*Count[2]  (1 as root)
              + Count[1]*Count[1]  (2 as root)
              + Count[2]*Count[0]  (3 as root)

Therefore, we can get the equation:
Count[i] = ∑ Count[0...k] * [ k+1....i]     0<=k<i-1  

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

/******************************************/
//Catlan number

public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        if (n < 1){
            return 1;
        }
        return (int)(factorial(2 * n, n + 1, n+ 1)/(n + 1));
    }
    private long factorial(int i, int j, int k){
        if (i == k){
            return i;
        }
        return i * factorial(i - 1,--j, k)/j;
    }
    
}
