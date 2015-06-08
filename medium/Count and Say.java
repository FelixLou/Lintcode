Question: http://www.lintcode.com/en/problem/count-and-say/
//recursion
public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
   public String countAndSay(int n) {
       // Write your code here
       if (n <= 0){
           return "";
       }
       if (n == 1){
           return "1";
       }
       String result = new String();
       result = countAndSay(n - 1);
  
       StringBuilder tmp = new StringBuilder();
     //  System.out.println("length:"+result.length());
   	   int count = 1;
       for (int i = 0; i < result.length();i++){
    	  // System.out.println(result.charAt(i) - '0');
    	   
    	   	if (i < result.length() - 1 && result.charAt(i) == result.charAt(i + 1)){
    	   		count++;
    	   	}
    	   	else {
         	   tmp.append(Integer.toString(count));
               tmp.append(result.charAt(i));
               count = 1;
    	   	}
       }
       result = tmp.toString();
     //  System.out.println(result);
       return result;
   }
}
/**********************************************************************/
public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
	   public String countAndSay(int n) {
	       // Write your code here
	       if (n <= 0){
	           return "";
	       }
	       if (n == 1){
	           return "1";
	       }
	       String result = "1";
	       int start = 1;
	       while (start < n){
	            StringBuilder tmp = new StringBuilder();
	     //  System.out.println("length:"+result.length());
	   	        int count = 1;
	            for (int i = 0; i < result.length();i++){
	    	  // System.out.println(result.charAt(i) - '0')
	    	   	    if (i < result.length() - 1 && result.charAt(i) == result.charAt(i + 1)){
	    	   		    count++;
	    	   	    }
	    	   	    else {
	         	        tmp.append(Integer.toString(count));
	                    tmp.append(result.charAt(i));
	                    count = 1;
	    	   	    }
	            }
	            start++;
	            result = tmp.toString();
	            }
	       return result;
	        }
}
