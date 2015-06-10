Question: http://www.lintcode.com/en/problem/unique-characters/
```
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char d = str.charAt(j);
                if (c == d) {
                    return false;
                }
            }
        }
        
        return true;
        
    }
}
/***********************************************/
Work for a-z, How to make it work for all char???
public boolean uniqueChars(String s) {
    int checker = 0;
    for (int i = 0; i < s.length(); i++) {
        int cur = s.charAt(i) - 'a';
        if ((checker & (1 << cur)) > 0) {
            return false;
        }
        checker |= 1 << cur;
    }
    return true;
    }
```
