Question: http://www.lintcode.com/en/problem/two-strings-are-anagrams/

Note: You can save some memory and time by using the second method. ++ at the first time and -- at the second time

```
public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s.length() != t.length()){
            return false;
        }
        int[] ss = new int[256];
        int[] tt = new int[256];
        for (int i = 0; i < s.length(); i++){
            ss[(int) s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++){
            tt[(int) t.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++){
            if (ss[i] != tt[i]){
                return false;
            }
        }
        return true;
    }
};
/******************************************************/
    public boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
           return false;
        }
        
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[(int) t.charAt(i)]--;
            if (count[(int) t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
```
