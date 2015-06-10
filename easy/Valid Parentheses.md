Question: http://www.lintcode.com/en/problem/valid-parentheses/
```
public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        if (s == null || s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
            	if (stack.empty()){
            	//	System.out.println("1");
            		return false;
            	}
                if (Math.abs(stack.peek() - s.charAt(i)) > 2){
                //	System.out.println("2");
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.empty()){
        //	System.out.println("3");
            return false;
        }
        return true;
    }
}
```
/*********************************************************************************************/
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if ("({[".contains(String.valueOf(c))) {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && is_valid(stack.peek(), c)) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean is_valid(char c1, char c2) {
		return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}')
				|| (c1 == '[' && c2 == ']');
	}
