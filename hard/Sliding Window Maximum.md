Question: http://www.lintcode.com/en/problem/sliding-window-maximum/
```
    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        // write your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int i = 0;
        
        for(int now : nums) {
            i++;
            
    		while((!deque.isEmpty() && now > deque.peekLast())) {
    			deque.pollLast();
    		} 
    		deque.offer(now);
    		if(i > k  && deque.peekFirst() == nums[i - k - 1])
    		         deque.pollFirst();
    		if(i >= k) {
    			ans.add(deque.peekFirst());
    		}
            
        }
        return ans;
    }
```
