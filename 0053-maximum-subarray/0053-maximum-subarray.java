class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int num:nums){
            currsum=Math.max(currsum+num,num);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}