Question: http://www.lintcode.com/en/problem/anagrams/

Related: http://www.lintcode.com/en/problem/two-strings-are-anagrams/
```
    public ArrayList<String> anagrams(String[] strs) {
        // write your code here
    	ArrayList<String> result = new ArrayList<String>();
        if (strs == null){
            return result;
        }
        boolean[] added = new boolean[strs.length];
        for (int i = 0; i < strs.length - 1; i++){
        	int k = 0;
            for (int j = i + 1; j < strs.length; j++){
                if (!added[i] && isAnagrams(strs[i],strs[j])){
                        while(k < 1){
                            result.add(strs[i]);
                            k++;
                        }
                    if (!added[j]){
                        result.add(strs[j]);   
                        added[j] = true;
                       // System.out.println("j "+strs[j]);
                    }
                }
            }
            added[i] = false;
        }
        return result;
    }
    private boolean isAnagrams(String s,String t){
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
