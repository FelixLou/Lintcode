Question:
```
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; --i) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }

        //remove the last " "
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
/****************************************************************************/
public class Solution {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        // write your code
        if (s == null || s.length() == 0){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1;i >= 0; i--){
            StringBuilder word = new StringBuilder();
            while (i >= 0 && s.charAt(i) != ' '){
                word.insert(0,s.charAt(i));
                i--;
            }
            if (word.length() > 0){
                res.append(word);
                res.append(' ');   
            }
        }
        if (res.length() > 0){
            res.deleteCharAt(res.length() - 1); 
        }
        return res.toString();
    }
}

