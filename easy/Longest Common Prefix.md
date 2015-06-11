Question: http://www.lintcode.com/en/problem/longest-common-prefix/
```
public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        StringBuilder result = new StringBuilder();
        if (strs == null || strs.length == 0){
            return result.toString();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++){
            min = Math.min(min,strs[i].length());
        }
        int digit = 0;
    loop:   while (digit < min){
                for (int i = 1; i < strs.length; i++){
                    if (strs[i].charAt(digit) != strs[0].charAt(digit)){
                        break loop;
                    }
                }
                result.append(strs[0].charAt(digit));
                digit++;
            }
            return result.toString();
    }
}
```
