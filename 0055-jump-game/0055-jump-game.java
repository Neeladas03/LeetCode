class Solution {
    private boolean helper(int ind,int n,int nums[]){
          if(ind>n)return false;
          if(ind==n) return true;
          int val=nums[ind];
          for(int i=1;i<=val;i++){
            if(helper(ind+i,n,nums))
            return true;
          }
          return false;
    }

    public boolean canJump(int[] nums) {
        int n=nums.length;
        return helper(0,n-1,nums);
    }
}