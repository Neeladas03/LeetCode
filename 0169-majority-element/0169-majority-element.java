class Solution {
    public int majorityElement(int[] nums) {
        int count=0,candidate=0;
        for(int num:nums){
            if(count==0)candidate=num;
            count+=(num==candidate)?+1:-1;
        }
        count=0;
        for(int num:nums){
            if(num==candidate)count++;
        }
        return (count>nums.length/2)?candidate:-1;
    }
}