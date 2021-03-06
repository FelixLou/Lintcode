Question: http://www.lintcode.com/en/problem/word-ladder/
```
public class Solution {
    /**
      * @param start, a string
      * @param end, a string
      * @param dict, a set of string
      * @return an integer
      */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if (dict == null || dict.size() == 0){
            return 0;
        }
        HashSet<String> hash = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.offer(start);
        hash.add(start);
        
        int length = 1;
        while(!queue.isEmpty()){
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++){
                String word = queue.poll();
                for (String nextWord: getNextWords(word, dict)){
                    if (hash.contains(nextWord)){
                        continue;
                    }
                    if (nextWord.equals(end)){
                        return length;
                    }
                    queue.offer(nextWord);
                    hash.add(nextWord);
                }
            }
        }
        return 0;
    }
    private String replace(String word, int index, char c){
        char[] chars = word.toCharArray();
        chars[index] = c;
        return new String(chars);
    }
    private ArrayList<String> getNextWords(String word, Set<String> dict){
        ArrayList<String> nextWords = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; c++){
            for (int i = 0; i < word.length(); i++){
                if (c == word.charAt(i)){
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)){
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }
}
```
