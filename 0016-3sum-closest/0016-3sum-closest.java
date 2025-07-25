class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;

            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                res=Math.max(res,total);
                j++;
            }
        }
        return res;
    }
}