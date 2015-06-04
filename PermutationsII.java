Question: http://www.lintcode.com/en/problem/permutations-ii/
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) 
            return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] visited = new int[nums.size()];
        Collections.sort(nums);
        permuteHelper(result,list,nums,visited);
        return result;
    }
    
    private void permuteHelper(
    	ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, 
        ArrayList<Integer> nums, int[] visited){
            if(list.size() == nums.size()){
                result.add(new ArrayList<Integer>(list));// result.add(list); 则不行
                
             // System.out.println(result);
                return;
        
            }
            for(int i = 0; i < nums.size(); i++){
                if(visited[i] == 1 || i > 0 && nums.get(i) == nums.get(i - 1) 
                && visited[i-1] == 0){
                    continue;
                }
                visited[i]=1;
                list.add(nums.get(i));
                permuteHelper(result,list,nums,visited);
                list.remove(list.size()-1);
                visited[i]=0;  
            }
            
        }
}
