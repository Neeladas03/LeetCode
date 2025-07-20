class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]==0 && nums[right]==0)right++;
            else if(nums[left]==0){
                swap(nums,left,right);
                left++;
                right++;
            }
            else right++;
        }
    }

    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}