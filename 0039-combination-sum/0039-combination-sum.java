class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        helper(0,candidates,ans,ds,target);
        return ans;
    }

    public void helper(int index,int nums[],List<List<Integer>>ans,List<Integer>ds,int t){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(t<0){
            return ;
        }

        for(int i=index;i<nums.length;i++){
            ds.add(nums[i]);
            helper(i,nums,ans,ds,t-nums[i]);
            ds.remove(ds.size()-1);
        }

    }
}