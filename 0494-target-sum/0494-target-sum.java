class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0,0,nums,target);
    }

    public static int backtrack(int index,int total,int nums[],int target){
        if(index==nums.length){
            return total==target?1:0;
        }

        return backtrack(index+1,total+nums[index],nums,target)+
        backtrack(index+1,total-nums[index],nums,target);
    }
}