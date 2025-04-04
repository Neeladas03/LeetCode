class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==0 || s.charAt(0)=='0')return 0;
        int mod=1000000007;

        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'? 0: 1;

        for(int i=2;i<=n;i++){
            int singledigit=s.charAt(i-1)-'0';
            int twodigit=(s.charAt(i-2)-'0')*10 + singledigit;

            if(singledigit!=0){
                dp[i]=(dp[i]+dp[i-1])%mod;
            }

            if(twodigit>=10 && twodigit<=26){
                dp[i]=(dp[i]+dp[i-2])%mod;
            }
        }

        return dp[n];
    }
}