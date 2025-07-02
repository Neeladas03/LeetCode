class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxlen=0;
        for(int num:nums){
            if(map.containsKey(num+1)){
                int len1=map.get(num);
                int len2=map.get(num+1);
                maxlen=Math.max(maxlen,len1+len2);
            }
        }
        return maxlen;
    }
}