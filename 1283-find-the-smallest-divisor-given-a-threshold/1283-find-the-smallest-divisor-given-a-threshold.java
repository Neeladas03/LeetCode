class Solution {
    public int smallestDivisor(int[] nums, int k) {
        int low=1,high=0;
        for(int num:nums){
            high=Math.max(num,high);
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean isValid(int nums[],int mid,int k){
        int value=0;
        for(int num:nums){
            value+=(num+mid-1)/mid;
        }
        return value<=k;
    }
}