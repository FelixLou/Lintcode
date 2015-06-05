Question: http://www.lintcode.com/en/problem/count-1-in-binary/
//num &= (num - 1) to remove the last 1 in the num;
//also to num without the last 1: num - num & (num - 1)
//pretty tricky,haha
public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        while (num != 0){
            num &= num -1;
            count++;
        }
        return count;
    }
};
