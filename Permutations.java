Question: http://www.lintcode.com/en/problem/permutations/

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) 
            return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        permuteHelper(result,list,nums);
        
        return result;
    }
    
    private void permuteHelper(
    	ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, 
        ArrayList<Integer> nums ){
            if(list.size() == nums.size()){
                result.add(new ArrayList<Integer>(list));// cannot use result.add(list)
                
             // System.out.println(result);
                return;
        
            }
            for(int i = 0; i < nums.size(); i++){
                if(list.contains(nums.get(i))){
                    continue;
                }
                list.add(nums.get(i));
                permuteHelper(result,list,nums);
                list.remove(list.size()-1);
            }
            
        }
}
