class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                count=0;
                nums[j++]=nums[i];
            }
            else{
                count++;
                if(count<=1)nums[j++]=nums[i];
            }
            
        }
        return j;
    }
}