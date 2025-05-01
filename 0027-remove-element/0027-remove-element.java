class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,x=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
            count++;
            nums[x++]=nums[i];
           }
        }
        return count;
    }
}