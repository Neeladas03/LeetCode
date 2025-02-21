class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>sublist=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,ans,sublist);
        return ans;
    }

    public void helper(int index,int nums[], List<List<Integer>>ans, List<Integer>sublist){
        if(index>=nums.length){
            ans.add(new ArrayList<>(sublist));
            return ;
        }

        sublist.add(nums[index]);
        helper(index+1,nums,ans,sublist);
        sublist.remove(sublist.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }

        helper(index+1,nums,ans,sublist);
    }
}