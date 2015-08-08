QUestion: http://www.lintcode.com/en/problem/jump-game/
```
Dynamic Programming
    public boolean canJump(int[] A) {
        boolean[] can = new boolean[A.length];
        can[0] = true;
        
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && j + A[j] >= i) {
                    can[i] = true;
                    break;
                }
            }
        }
        
        return can[A.length - 1];
    }
///////////////////////////
Greedy
    public boolean canJump(int[] A) {
        // wirte your code here
        if (A == null || A.length == 0){
            return false;
        }
        int farest = A[0];
        for (int i = 1; i < A.length - 1; i++){
            if (i <= farest && A[i] + i > farest){
                farest = A[i] + i;
            }
        }
        return farest >= A.length - 1;
    }
```
