Question: http://www.lintcode.com/en/problem/n-queens/
```
class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (n <= 0) {
            return result;
        }
        ArrayList<Integer> cols = new ArrayList<Integer>();
        search(result, cols, n);
        return result;
    }
    
    private void search(ArrayList<ArrayList<String>> result, ArrayList<Integer> cols,int n){
        if (cols.size() == n){
            result.add(drawChessboard(cols, n));
        }
        for (int i = 0; i < n; i++){
            if(!isValid(cols, i)){
                continue;
            }
            cols.add(i);
            search(result,cols,n);
            cols.remove(cols.size() - 1);
        }
    }
    private ArrayList<String> drawChessboard(ArrayList<Integer> cols, int n){
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < n; i++){
            StringBuilder rowString = new StringBuilder();
            for (int j = 0; j < n; j++){

                if (cols.get(i) == j){
                    rowString.append("Q");
                }
                else{
                    rowString.append(".");
                }
            }
            list.add(rowString.toString());
        }
        return list;
    }
    private boolean isValid(ArrayList<Integer> cols, int col){
        int row = cols.size();
        for (int i = 0; i < row; i++){
            if(cols.get(i) == col || Math.abs(cols.get(i) - col) == row - i){
                return false;
            }
        }
        return true;
    }
}
```
