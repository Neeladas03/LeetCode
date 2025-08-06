class Solution {
    public int[] sortedSquares(int[] nums) {
        int  n=nums.length;
        int left=0,right=n-1;
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                res[i]=nums[right]*nums[right];
                right--;
            }
            else{
                res[i]=nums[left]*nums[left];
                left++;
            }
        }
        return res;
    }
}