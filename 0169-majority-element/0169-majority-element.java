class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int cond=nums.length/2;
        for(int val:map.keySet()){
            if(map.get(val)>cond){
                return val;
            }
        }

        return 0;
    }
}