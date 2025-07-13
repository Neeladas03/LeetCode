class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int lislen[]=new int[n];
        for(int i=0;i<n;i++){
            lislen[i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(lislen[j]+1>lislen[i]){
                        lislen[i]=lislen[j]+1;
                    }
                }
            }
        }

        int maxlen=0;
        for(int len:lislen){
            maxlen=Math.max(len,maxlen);
        }

        return maxlen;
    }
}