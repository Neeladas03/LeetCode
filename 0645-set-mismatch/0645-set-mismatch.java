class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int n=nums.length;

        long desired_sum= n * (n+1) / 2;
        long desired_sqsum= n* (n+1) * (2*n+1) / 6;
        
        long actual_sum=0,actual_sqsum=0;
        for(int num:nums){
            actual_sum+=num;
            actual_sqsum+=(long)num*num;
        }

        long sum_diff=desired_sum-actual_sum;
        long sq_diff=desired_sqsum-actual_sqsum;
        long sum= sq_diff/sum_diff;

        int missing=(int)((sum+sum_diff)/2);
        int repeat=(int)(sum-missing);

        ans[0]=repeat;
        ans[1]=missing;

        return ans; 
    }
}