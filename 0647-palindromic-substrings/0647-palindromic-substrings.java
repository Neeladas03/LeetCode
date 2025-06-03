class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=checkPalindrome(s,i,i);
            res+=checkPalindrome(s,i,i+1);
        }
        return res;
    }

    static int checkPalindrome(String s,int left,int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}