Question: http://www.lintcode.com/en/problem/segment-tree-query-ii/
```
    public int query(SegmentTreeNode root, int start, int end) {
        注意特殊情况检查！！！
        if (root==null || end < root.start || start > root.end){
            return 0;
        }
        start = Math.max(root.start, start);
        end = Math.min(root.end, end);
        if (start == root.start && end == root.end){
            return root.count;
        }
        int mid = (root.start + root.end)/2;
        int leftCount = 0;
        int rightCount = 0;
        if (start <= mid){
            if (end > mid){
                leftCount = query(root.left, start, mid);
            }
            else{
                leftCount = query(root.left, start, end);
            }
        }
        if (end > mid){
            if (start <= mid){
                rightCount = query(root.right, mid + 1, end);
            }
            else{
                rightCount = query(root.right, start, end);
            }
        }
        return leftCount + rightCount;
    }
  ```
