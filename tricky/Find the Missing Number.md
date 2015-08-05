Question: http://www.lintcode.com/en/problem/find-the-missing-number/
Answer: http://www.geeksforgeeks.org/find-the-missing-number/
```
public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0){
            return 0;
        }
        int sum1 = 0;
        for (int i = 1; i <= nums.length; i++){
            sum1 ^= i;
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++){
            sum2 ^= nums[i];
        }
        return sum1 ^ sum2;
    }
}
/////////////////////////////////////////////////////////////////////////
public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= nums.length; i++){
            sum += i;
        }
        for (int i = 0; i < nums.length; i++){
            sum = sum - nums[i];
        }
        return sum;
    }
}
```
