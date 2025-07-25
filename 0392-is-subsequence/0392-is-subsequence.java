class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int s1=0,s2=0;
        while(s1<n && s2<m){
            if(s.charAt(s1)==t.charAt(s2)){
                s1++;
                s2++;
            }
            else{
                s2++;
            }
        }
        return s1==n;
    }
}