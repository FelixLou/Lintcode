Question: http://www.lintcode.com/en/problem/nuts-bolts-problem/
```
 public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
        // write your code here
        sort(nuts,bolts,0,nuts.length-1, compare);
    }
    public void sort(String[] nuts, String[] bolts, int l, int h, NBComparator compare) {
        if(l < h){
            int p = partition(nuts, l,h, bolts[h], compare);
            partition(bolts, l,h,nuts[p], compare);
            sort(nuts, bolts, l, p-1,compare);
            sort(nuts, bolts, p+1, h,compare);
        }
    }
    public int partition(String[] strs, int l, int w, String pivot, NBComparator compare) {
        int j = l-1;
        for (int i = l; i < w; i++) {
            if (compare.cmp(strs[i], pivot) == -1 || compare.cmp(pivot, strs[i]) == 1) {
                j++;
                swap(strs, i, j);
            } else if (compare.cmp(strs[i], pivot) == 0 ||compare.cmp(pivot, strs[i]) == 0) {
                swap(strs, i, w);
                i--;
            }
        }
        j++;
        swap(strs, j,w);
        return j;
    }
    private void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
```
