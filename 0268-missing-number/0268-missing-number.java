class Solution {
    public int missingNumber(int[] nums) {
        int actualTotal=0;
        int n=nums.length;
        for(int num:nums)actualTotal+=num;

        int total=n*(n+1)/2;
        return total-actualTotal;
    }
}