class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int prev=nums[0];
        int prev2=0;

        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1) take+=prev2;
            int not=0+prev;
            int curr=Math.max(take,not);
            prev2=prev;
            prev=curr;
        }
        return prev;


       
    }

    
    }
