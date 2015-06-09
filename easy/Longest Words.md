Question: http://www.lintcode.com/en/problem/longest-words/
```
class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> result = new ArrayList<String>();
        if (dictionary == null){
            return result;
        }
        int max = dictionary[0].length();
        result.add(dictionary[0]);
        for (int i = 1; i < dictionary.length; i++){
            if (dictionary[i].length() > max){
                max = dictionary[i].length();
                result.removeAll(result);
                result.add(dictionary[i]);
            }
            else if (dictionary[i].length() == max){
            	result.add(dictionary[i]);
            }
        }
        return result;
    }
	       
};
```
