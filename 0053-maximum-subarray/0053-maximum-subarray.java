class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int tot=0;

        for(int val:nums){
            if(tot<0){
                tot=0;
            }
            tot+=val;
            ans=Math.max(ans,tot);
        }

        return ans;
    }
}