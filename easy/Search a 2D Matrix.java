Question: http://www.lintcode.com/en/problem/search-a-2d-matrix/
public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0){
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
 
        while (start + 1 < end){
            int mid = (start + end)/2;
            int row = mid/matrix[0].length;
            int coloum = mid%matrix[0].length;
            if (target == matrix[row][coloum]){
                return true;
            }
            else if (target > matrix[row][coloum]){
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (matrix[start/matrix[0].length][start%matrix[0].length] == target){
            return true;
        }
        if (matrix[end/matrix[0].length][end%matrix[0].length] == target){
            return true;
        }
        return false;
    }
}
