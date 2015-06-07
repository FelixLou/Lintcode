Question: http://www.lintcode.com/en/problem/compare-strings/
//Because there would be only 26 letters, we could use count method to solve this method;
//Because there could be duplicate letters in the string, we could not use hash to solve this problem!
//Method to remember: Convert a char to int
public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A == null || B == null || A.length() < B.length()){
            return false;
        }
        if (B.length() == 0){
            return true;
        }
        int[] letters = new int[26];
        for (int i = 0; i < A.length(); i++){
            letters[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++){
            letters[B.charAt(i) - 'A']--;
            if (letters[B.charAt(i) - 'A'] < 0){
                return false;
            }
        }
        return true;
    }
}
