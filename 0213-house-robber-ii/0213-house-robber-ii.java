class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);

        int houses1=helper(0,n-2,nums);
        int houses2=helper(1,n-1,nums);

        return Math.max(houses1,houses2);
    }

    static int helper(int start,int end,int nums[]){
        int n=(end-start)+1;
        if(n==1)return nums[start];
        int dp[]=new int[n];
        
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[start+i],dp[i-1]);
        }

        return dp[n-1];
    }
}