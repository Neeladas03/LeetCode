class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum=0;
        for(int num:nums)totalsum+=num;

        if((totalsum+target)%2!=0 || totalsum<Math.abs(target))return 0;

        int subsetsum=(totalsum+target)/2;

        int dp[]=new int[subsetsum+1];
        dp[0]=1;

        for(int num:nums){
            for(int i=subsetsum;i>=num;i--){
                dp[i]+=dp[i-num];
            }
        }

        return dp[subsetsum];
    }
}