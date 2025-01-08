class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(0,dp,nums);
    }

    private int helper(int ind,int dp[],int nums[]){
        int n=nums.length;
        if(ind>=n-1) return 0;
        if(nums[ind]==0)return Integer.MAX_VALUE;
        
        if(dp[ind]!=-1)return dp[ind];
        int min=Integer.MAX_VALUE;
        int max=Math.min(ind+nums[ind],n-1);

        for(int i=ind+1;i<=max;i++){
            int ans=helper(i,dp,nums);
            if(ans!=Integer.MAX_VALUE){
                min=Math.min(min,ans+1);

            }
        }

        dp[ind]=min;
        return dp[ind];
        
    }
}