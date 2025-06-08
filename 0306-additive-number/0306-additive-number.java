import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String s) {
        int n = s.length();
        
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String num1 = s.substring(0, i);
                String num2 = s.substring(i, j);

                if ((num1.length() > 1 && num1.startsWith("0")) ||
                    (num2.length() > 1 && num2.startsWith("0"))) continue;
                
                if (isValid(s, new BigInteger(num1), new BigInteger(num2), j))
                    return true;
            }
        }
        return false;
    }

    private boolean isValid(String s, BigInteger num1, BigInteger num2, int start) {
        if (start == s.length()) return true;

        BigInteger sum = num1.add(num2);
        String sumStr = sum.toString();

        if (!s.startsWith(sumStr, start)) return false;

        return isValid(s, num2, sum, start + sumStr.length());
    }
}
