class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean seen[]=new boolean[nums.length];
        List<Integer>ds=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,seen,ds,ans);
        return ans; 
    }

    public void helper(int nums[],boolean seen[],List<Integer>ds,List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(seen[i])continue;
            if(i>0 && nums[i]==nums[i-1] && !seen[i-1])continue;
            seen[i]=true;
            ds.add(nums[i]);
            helper(nums,seen,ds,ans);
            ds.remove(ds.size()-1);
            seen[i]=false;
        }
    }
}