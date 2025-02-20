class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>bucket[]=new List[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer>ans=new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && ans.size()<k;i--){
            if(bucket[i]!=null){
                ans.addAll(bucket[i]);
            }
        }
        
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
                 result[i]=ans.get(i);
        }

       return result;

    }
}