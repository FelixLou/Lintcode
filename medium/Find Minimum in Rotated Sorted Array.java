Question: http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/
//Remember to consider duplicates and no-rotated array
public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        int start = 0;
        int end = num.length - 1;
        int mid;
        while (start + 1 < end){
            mid = start + (end - start)/2;
            if (num[mid] < num[0]){
            	//System.out.println(mid);
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (num[end] < num[0]){
            return num[end];
        }
        return num[0];
        
    }
        
}
