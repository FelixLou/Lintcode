Question: http://www.lintcode.com/en/problem/length-of-last-word/
```
 public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        if (s == null || s.length() == 0){
            return 0;
        }
        int size =s.length();
        int count = 0;
        int index = -1;
        for (int i =size - 1; i >= 0;){
            while (s.charAt(i) == ' '){
                 i--;
                continue;
            }
            index = i;
            break;
        }
        for (int i =index; i >= 0; i--){
            if (s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}
/********************************************************/
public int lengthOfLastWord(String s) { 
    if(s==null || s.length() == 0)
        return 0;
 
    int result = 0;
    int len = s.length();
 
    boolean flag = false;
    for(int i=len-1; i>=0; i--){
        char c = s.charAt(i);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            flag = true;
            result++;
        }else{
            if(flag)
                return result;
        }
    }
 
    return result;
}
```
