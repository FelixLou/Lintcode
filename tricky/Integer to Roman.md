Question: http://www.lintcode.com/en/problem/integer-to-roman/
```
    public String intToRoman(int n) {
        // Write your code here
        if (n <= 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
	    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    int digit = 0;
	    while (n > 0){
	        int times = n/nums[digit];
	        n = n % nums[digit];
	        while(times > 0){
	            result.append(symbols[digit]);
	            times--;
	        }
	        digit++;
	    }
        return result.toString();
        
    }

//I wrote before .........Shame on me!

    public String intToRoman(int n) {
        // Write your code here
        assert(n > 0 && n < 4000);
        StringBuilder result = new StringBuilder();
        while(n >= 1000){
            n = n - 1000;
            result.append("M");
        }
        while (n >= 900){
            n = n - 900;
            result.append("CM");
        }
        while(n >= 500){
            n = n - 500;
            result.append("D");
        }
        while (n >= 400){
            n = n - 400;
            result.append("CD");
        }
        while(n >= 100){
            n = n - 100;
            result.append("C");
        }
        while (n >= 90){
            n = n - 90;
            result.append("XC");
        }
        while(n >= 50){
            n = n - 50;
            result.append("L");
        }
        while (n >= 40){
            n = n - 40;
            result.append("XL");
        }
        while(n >= 10){
            n = n - 10;
            result.append("X");
        }
        while (n >= 9){
            n = n - 9;
            result.append("IX");
        }
        while(n >= 5){
            n = n - 5;
            result.append("V");
        }
        while (n >= 4){
            n = n - 4;
            result.append("IV");
        }
        while (n >= 1){
            n = n - 1;
            result.append("I");
        }
        return result.toString();
        
    }
```
