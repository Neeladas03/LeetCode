class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long ans=0;

        int maxbefore[]=new int[n];
        maxbefore[0]=nums[0];
        for(int i=1;i<n;i++){
            maxbefore[i]=Math.max(maxbefore[i-1],nums[i]);
        }

        int maxafter[]=new int[n];
        maxafter[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            maxafter[i]=Math.max(maxafter[i+1],nums[i]);
        }

        for(int i=1;i<n-1;i++){
            long diff=maxbefore[i]-nums[i];
            if(diff>0){
                ans=Math.max(ans,diff*maxafter[i+1]);
            }
        }
        return ans;
    }
}