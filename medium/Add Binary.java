Question: http://www.lintcode.com/en/problem/add-binary/
//char to int: char - '0' or Character.getNumericValue(c)
public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
public String addBinary(String a, String b) {
    int m = a.length();
    int n = b.length();
    int carry = 0;
    String res = "";
    // the final length of the result depends on the bigger length between a and b, 
    // (also the value of carry, if carry = 1, add "1" at the head of result, otherwise)
    int maxLen = Math.max(m, n);
    for (int i = 0; i < maxLen; i++) {
        // start from last char of a and b
        // notice that left side is int and right side is char
        // so we need to  minus the decimal value of '0'
        int p=0,q=0;
        if(i<m)
            p = a.charAt(m-1-i) - '0';
        else
            p = 0;
        
        if(i<n)
            q = b.charAt(n-1-i)-'0';
        else
            q = 0;
            
        int tmp = p + q + carry;
        carry = tmp / 2;
        res = tmp % 2 + res;
    }
    return (carry == 0) ? res : "1" + res;
    }
}
/********************************************************/
public String addBinary(String a, String b) {
    String result = "";
    int m = a.length();
    int n = b.length();

    int tmp = 0;

    while (m+n >0){
        tmp += m>0? a.charAt(--m) - '0': 0;
        tmp += n>0? b.charAt(--n) - '0': 0;

        result = tmp%2 +result;
        tmp /= 2;
    }
    return (tmp == 0)? result: "1"+result;
}
/**********************************************************/
   public String addBinary(String a, String b) {
        if (a==null ||a.length()==0){
            return b;
        }
        
        if (b==null || b.length()==0){
            return a;
        }
        
       StringBuilder sb=new StringBuilder();
       
        
        int lastA=a.length()-1;
        int lastB=b.length()-1;
        int carry=0;
        
        
        while (lastA>=0 ||lastB>=0 ||carry>0){
            int num1=lastA>=0?a.charAt(lastA--)-'0':0;
            int num2=lastB>=0?b.charAt(lastB--)-'0':0;
            int current=(num1+num2+carry)%2;
            carry=(num1+num2+carry)/2;
            
            sb.insert(0, current);
            
            
        }
        
        return sb.toString();
    }
/****************************************************************/
//recursive
public class Solution {
    public String addBinary(String a, String b, int carry) {
        if (a.length()==0 && b.length()==0) {
            if (carry==1) {
                return "1";
            }
            else {
                return "";
            }
        }
        String aLeft = a;
        int sum = 0;
        if (a.length()>0){
            aLeft = a.substring(0, a.length()-1);
            sum = sum + a.charAt(a.length()-1) - '0';
        }
        String bLeft = b;
        if (b.length()>0){
            bLeft = b.substring(0, b.length()-1);
            sum = sum + b.charAt(b.length()-1) - '0';
        }
        sum = sum + carry;
        return addBinary(aLeft, bLeft, sum/2) + Integer.toString(sum%2);

    }
    public String addBinary(String a, String b) {
        return addBinary(a, b, 0);
    }
} 
