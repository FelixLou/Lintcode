Question: http://www.lintcode.com/en/problem/search-a-2d-matrix-ii/
public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
     //Search from top-right to bottom-left 
     //Then, you have only one choice each time
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0){
            return 0;
        }
        if (matrix[0] == null || matrix[0].length == 0){
            return 0;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        int count = 0;
        while (i < matrix.length && j >= 0){
            if (matrix[i][j] == target){
                count++;
                i++;
                j--;
            }
            else if (matrix[i][j] < target){
                i++;
            }
            else {
                j--;
            }
        }
        return count;
    }
}
