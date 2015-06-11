Question: http://www.lintcode.com/en/problem/matrix-zigzag-traversal/

Note: change zigzag direction when move straight down or right.
```
public class Solution {
    /**
     * @param matrix: a matrix of integers
     * @return: an array of integers
     */ 
	public int[] printZMatrix(int[][] matrix) {
		// write your code here
		if (matrix == null){
			return null;
		}
		int size = matrix.length * matrix[0].length;
		int[] zMatrix = new int[size];
		int i = 0;
		int j = 0;
		int index = 0;
		boolean left = true;
		zMatrix[index++] = matrix[0][0];
		while (i < matrix.length && j < matrix[0].length && index < size){
			if ((i== 0 || i == matrix.length -1)&&j < matrix[0].length - 1){
				j = j + 1;
				zMatrix[index++] = matrix[i][j];
				left = left?false:true;
			//	System.out.println("1" + " "+zMatrix[index - 1]);
			}
			while (!left && j != 0 && i != matrix.length - 1){

				i = i + 1;
				j = j - 1;
				zMatrix[index++] = matrix[i][j];
				left = false;
			//	System.out.println("2" + " "+zMatrix[index - 1]);

			}
			if (i < matrix.length - 1){
				i = i + 1;
				zMatrix[index++] = matrix[i][j];
				left = left?false:true;
			//	System.out.println("3" +" "+ zMatrix[index - 1]);
			}
			//System.out.println (i + "ij "+ j);
			while (left && i != 0 && j != matrix[0].length - 1){
				i = i - 1;
				j = j + 1;
				zMatrix[index++] = matrix[i][j];
				left = true;
			//	System.out.println("4" + " "+zMatrix[index - 1] + i + " " + j);
			}
		}
		return zMatrix;
	}
}
```
