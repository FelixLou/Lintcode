Question: http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array-ii/
//When there are dulpicates, you cannot dicide where to do. For example, [999,999,1000,1000,10000,0,999,999,999],
//when you meet 999, you don't know whether start or end need to be mid;
//It's pretty tricky!
public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        int min = num[0];
        for (int i = 0; i< num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
