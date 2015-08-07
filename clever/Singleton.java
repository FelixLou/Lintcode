class Solution {
    /**
     * @return: The same instance of this class every time
     */
    private static Solution instance = null;
    private static Object lock = new Object();
    public static Solution getInstance() {
        // write your code here
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Solution();
                }
            }
        }
        return instance;
    }
};
