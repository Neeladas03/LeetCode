class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        for(int num:nums){
            int count=0;
            for(int val:nums){
                if(val==num)continue;
                if(val<num)count++;
            }
            ans[i++]=count;
        }
        return ans;
    }
}