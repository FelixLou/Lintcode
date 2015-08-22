Question: http://www.lintcode.com/en/problem/ugly-number/
```
//priority queue
    public long kthPrimeNumber(int k) {
        // write your code here
    	long uglyNumber = 0;
    	Queue pq = new PriorityQueue<Long>();
    	pq.offer((long)3);
    	pq.offer((long)5);
    	pq.offer((long)7);
    	for (int i = 0; i < k; i++) {
    		uglyNumber = (long)pq.poll();
    		if (uglyNumber % 3 == 0) {
    			pq.offer(uglyNumber * 3);
    		} else if (uglyNumber % 5 == 0) {
    			pq.offer(uglyNumber * 3);
    			pq.offer(uglyNumber * 5);
    		} else {
    			pq.offer(uglyNumber * 3);
    			pq.offer(uglyNumber * 5);
    			pq.offer(uglyNumber * 7);
    		}
    	}
    	return uglyNumber;
    }

//DP
    public long kthPrimeNumber(int k) {
        // write your code here
    	long[] uglyNumbers = new long[k + 1];
    	int indexFor3 = 0, indexFor5 = 0, indexFor7 = 0; //multiplier index
    	uglyNumbers[0] = 1;
    	for (int i = 1; i <= k; i++) {
    		uglyNumbers[i] = Math.min(Math.min(3 * uglyNumbers[indexFor3], 5 * uglyNumbers[indexFor5]), 7 * uglyNumbers[indexFor7]);
    		if (uglyNumbers[i] == 3 * uglyNumbers[indexFor3]) {
				indexFor3++;
    		}
    		if (uglyNumbers[i] == 5 * uglyNumbers[indexFor5]) {
    			indexFor5++;
    		} 
    		if (uglyNumbers[i] == 7 * uglyNumbers[indexFor7]) {
    			indexFor7++;
    		}
    	}
    	return uglyNumbers[k];
    }
```
