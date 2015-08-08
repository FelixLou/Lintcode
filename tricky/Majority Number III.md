Question: http://www.lintcode.com/en/problem/majority-number-iii/
```
public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
     public int majorityNumber(ArrayList<Integer> nums, int k) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {//Found duplicates, count++
                map.put(num, map.get(num) + 1);
            } else {
                if (map.size() == k) {//All candidates added, do count--
                    Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
                    while (iter.hasNext()) {
                        Map.Entry<Integer, Integer> entry = iter.next();
                        if (entry.getValue() - 1 == 0) {
                            iter.remove();
                        } else {
                            map.put(entry.getKey(), entry.getValue() - 1);
                        }
                    }//While
                } else {
                    map.put(num, 1);
                }
            }
        }//For
        
        int result = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
```
