class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n-2;i++){
             for(int j=1;j<n-1;j++){
                for(int k=2;k<n;k++){
                    long diff=nums[i]-nums[j];
                    if(diff>0){
                        ans=Math.max(diff*nums[k],ans);
                    }
                }
             }
        }

        return ans;
    }
}