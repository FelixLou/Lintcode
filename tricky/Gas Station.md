Question: http://www.lintcode.com/en/problem/gas-station/

Answer: http://www.cnblogs.com/yuzhangcmu/p/4179228.html
```
public class Solution {
    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
   public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        if (gas == null || cost == null || gas.length != cost.length){
            return -1;
        }
        int sum = 0;
        int total = 0;
        int index = -1;
        int size = gas.length;
        for (int i = 0; i < size; i++){
            total += gas[i] -cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0){
                sum = 0;
                index = i;
            }
        }
        return total >= 0? index + 1: -1;
    }
}
```
