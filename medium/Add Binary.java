Question: http://www.lintcode.com/en/problem/add-binary/
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
