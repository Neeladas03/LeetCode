class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1)return cost[0];
        int dp[]=new int[n+1];
        int prev2=cost[n-1],prev1=cost[n-2],curr=0;
        for(int i=n-3;i>=0;i--){
            curr=cost[i]+Math.min(prev2,prev1);
            prev2=prev1;
            prev1=curr;
        }
        return Math.min(prev2,prev1);
    }
}