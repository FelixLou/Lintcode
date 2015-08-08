Question: http://www.lintcode.com/en/problem/jump-game-ii/
```
Greedy
    public int jump(int[] A) {
        // write your code here
        int times = 0;
        int farest = 0;
        for (int i = 0; i < A.length; i++){
            if (i <= farest && A[i] + i > farest){
                farest = A[i] + i;
                times++;
            }
            if (farest >= A.length - 1){
                return times;
            }
        }
        return -1;
    }
//////////////////////////////////////////////////////////
Dynamic Programming
    public int jump(int[] A) {
        int[] steps = new int[A.length];
        
        steps[0] = 0;
        for (int i = 1; i < A.length; i++) {
            steps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (steps[j] != Integer.MAX_VALUE && j + A[j] >= i) {
                    steps[i] = steps[j] + 1;
                    break;
                }
            }
        }
        
        return steps[A.length - 1];
    }
```
