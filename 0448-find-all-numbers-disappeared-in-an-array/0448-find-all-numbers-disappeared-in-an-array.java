class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            if(nums[num-1]>0){
                nums[num-1]*=-1;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }

        return res;
    }
}