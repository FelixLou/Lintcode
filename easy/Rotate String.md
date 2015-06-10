Question: http://www.lintcode.com/en/problem/rotate-string/

Note: Remember to consider corner case
```
public class Solution {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
    public char[] rotateString(char[] A, int offset) {
        // wirte your code here
        if (A == null || A.length == 0){
            return new char[0];
        }
        char[] result = new char[A.length];
        offset = offset % A.length;
        for (int i = A.length - offset; i < A.length; i++){
            result[i - A.length + offset] = A[i];
        }
        for (int i = 0; i < A.length - offset; i++){
            result[offset + i] = A[i];
        }
        return result;
        
    }
};
```
