Question: http://www.lintcode.com/en/problem/permutation-index/
```
    public long permutationIndex(int[] permutation) {
        long index = 0;
        int position = 2;// position 1 is paired with factor 0 and so is skipped
        long factor = 1;
        for (int p = permutation.length - 2; p >= 0; p--) {
            int successors = 0;
            for (int q = p + 1; q < permutation.length; q++) {
                if (permutation[p] > permutation[q]) {
                    successors++;
                }
            }
            index += ((long)successors * factor);
            factor *= position;
            position++;
        }
        return index + 1;
        
    }
```
