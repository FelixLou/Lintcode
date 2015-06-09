Question: http://www.lintcode.com/en/problem/gas-station/
//If the sum of gas is more than the sum of cost, it could success. So the thing you need to do is to find 
//where you should start.
```public class Solution {
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
        int remain = 0;
        int total = 0;
        int index = -1;
        int size = gas.length;
        for (int i = 0; i < size; i++){
            total += gas[i] -cost[i];
            remain += gas[i] - cost[i];
            if (remain < 0){
                remain = 0;
                index = i;
            }
        }
        return total >= 0? index + 1: -1;
    }
}```
