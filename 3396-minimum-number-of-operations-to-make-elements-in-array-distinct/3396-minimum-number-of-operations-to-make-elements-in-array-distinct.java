class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer>last_seen=new HashMap<>();
        int res=0;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(last_seen.containsKey(num) && last_seen.get(num)>=3*res){
                res=(last_seen.get(num)+1+2)/3;
            }
            last_seen.put(num,i);
        }
        return res;
    }
}