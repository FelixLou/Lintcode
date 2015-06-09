Question: http://www.lintcode.com/en/problem/plus-one/
```
public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        if (digits == null){
            return null;
        }
        int size = digits.length;
        boolean allNine = false;
        for (int i = 0; i < size; i++){
            if (digits[i] != 9){
                allNine = false;
                break;
            }
            allNine = true;
        }
        if (allNine){
            int[] result = new int[size + 1];
            result[0] = 1;
            return result;
        }
        else {
            int[] result = new int[size];
            int carry = 1;
            for (int i = size - 1; i >= 0; i--){
                result[i] = (digits[i] +  carry)%10;
                carry = (digits[i] + carry)/10;
            }
            return result;
        }
        
    }
}
```
