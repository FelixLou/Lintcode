Question: http://www.lintcode.com/en/problem/majority-number-ii/
```
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    // test case: 1 1 1 1 2 2 3 3 4 4 4 
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.size() == 0){
            return -1;
        }
        int count1 = 0;
        int count2 = 0;
        int num1 = -1 ;
        int num2 = -1;
        //int num2 = nums.get(1);
        for (int i = 0; i < nums.size(); i++){
            if (num1 == nums.get(i)){
                count1++;
            }
            else if (num2 == nums.get(i)){
                count2++;
            }
            else if (count1 == 0){
                num1 = nums.get(i);
                count1++;
            }
            else if (count2 == 0){
                num2 = nums.get(i);
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = count2 = 0;
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) == num1){
                count1++;
            }
            if(nums.get(i) == num2){            
                count2++;
            }
        }
        return count1 > count2 ? num1 : num2;
    }
}
```
