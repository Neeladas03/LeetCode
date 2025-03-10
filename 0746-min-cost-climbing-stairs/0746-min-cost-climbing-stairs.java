class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1)return cost[0];
        int dp[]=new int[n+1];
        dp[n-1]=cost[n-1];
        dp[n-2]=cost[n-2];
        for(int i=n-3;i>=0;i--){
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}