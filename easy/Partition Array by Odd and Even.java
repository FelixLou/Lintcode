Question: http://www.lintcode.com/en/problem/partition-array-by-odd-and-even/
// Two pointers template!!!
public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums == null){
            return;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            while (i <= j && nums[i]%2 == 1){
                i++;
            }
            while (i <= j && nums[j]%2 == 0){
                j--;
            }
            if (i <= j){
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                i++;
                j--;
            }
        }
    }
}
