class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
           if(nums[i]==1){
            count++;
           }
           else if(nums[i]==0){
            maxcount=Math.max(count,maxcount);
            count=0;
           }
        }
        if(count>maxcount){
            return count;
        }
        else{
        return maxcount;
        }

    
    }
}