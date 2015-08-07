Question: http://www.lintcode.com/en/problem/majority-number/
```
public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(0) != nums.get(i)) {
                nums.remove(i);
                nums.remove(0);
                i = 0;
            }
        }
        return nums.get(0);
    }
}
```
