Question: http://www.lintcode.com/en/problem/valid-palindrome/
```
public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        for (i = 0; i < s.length()/2;){
            while (i < s.length()/2 && !Character.isLetterOrDigit(s.charAt(i)) ){
                i++;
            }
            while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j)) ){
                j--;
            }
            if (i < s.length()/2 && s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
```
