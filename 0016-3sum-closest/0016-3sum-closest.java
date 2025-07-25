class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
               if(Math.abs(target-total)<Math.abs(target-res)){
                res=total;
               }
               if(total==target)return target;
               else if(total<target)j++;
               else k--;
            }
        }
        return res;
    }
}