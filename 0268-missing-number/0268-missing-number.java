class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        int n=nums.length;
        total=n*(n+1)/2;
        int actual=0;
        for(int num:nums){
            actual+=num;
        }

        return total-actual;
    }
}