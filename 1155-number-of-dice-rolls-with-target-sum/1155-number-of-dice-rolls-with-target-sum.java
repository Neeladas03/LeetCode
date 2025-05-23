class Solution {
     static final int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        dp[0][0]=1;

        for(int dice=1;dice<=n;dice++){
            for(int sum=1;sum<=target;sum++){
                dp[dice][sum]=0;
                for(int face=1;face<=k && face<=sum;face++){
                    dp[dice][sum]=(dp[dice][sum]+ dp[dice-1][sum-face])%MOD;
                }
            }
        }
        return dp[n][target];
    }
}