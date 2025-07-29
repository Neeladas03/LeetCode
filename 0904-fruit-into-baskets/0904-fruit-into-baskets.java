class Solution {
    public int totalFruit(int[] nums) {
        int maxfruits=0;
        int left=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>2){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)map.remove(nums[left]);
                left++;
            }
            maxfruits=Math.max(maxfruits,right-left+1);
        }
        return maxfruits;
    }
}