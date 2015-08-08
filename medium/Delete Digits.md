Question: http://www.lintcode.com/en/problem/delete-digits/
```
public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        String result = "";
        int remain = A.length() - k;
        int start = 0;
        int end = k + 1;
        while(remain != 0){
            int min = 10;
            int index = 0;
            for (int i = start; i < end; i++){
                if ( Character.getNumericValue(A.charAt(i)) < min){
                    min = Character.getNumericValue(A.charAt(i));
                    index = i;
                }
            }
            result = result + min;
            remain--;
            end++;
            start = index + 1;
        }
        //awesome method to delete the beforeing 0s
        int index = 0;
        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }
        if (index == result.length()) {
            return "0";
        }
        return result.substring(index);
    }
}
///////////////////////////////////////////////////////
public String DeleteDigits(String A, int k) {
    if (A == null || A.length() <= k) {
        return "";
    }
    Stack<Integer> stack = new Stack<Integer>();
    int deleted = 0;
    for (int i =0; i< A.length(); i++) {
    int cur = A.charAt(i) - '0';
    while (!stack.isEmpty() && stack.peek() > cur && deleted < k) {
        deleted++;
        stack.pop();
    }
    stack.push(cur);
    }
    while (deleted < k) {
    deleted++;
    stack.pop();
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
    sb.insert(0,  stack.pop());
    }
    while (sb.length() > 0 && sb.charAt(0) == '0') {
    sb.deleteCharAt(0);
    }
    return sb.toString();
}
```
