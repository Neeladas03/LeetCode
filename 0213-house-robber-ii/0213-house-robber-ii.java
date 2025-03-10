class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(helper(nums,0,n-2),helper(nums,1,n-1));
    }

    public int helper(int nums[],int start,int end){
        int prev2=0,prev1=0,curr=0;
        for(int i=start;i<=end;i++){
            curr=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}