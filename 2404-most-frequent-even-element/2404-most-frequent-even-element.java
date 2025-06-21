class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfreq=0,res=Integer.MAX_VALUE;
        int freq=0;
        for(int num:nums){
            if(num%2==0){
                freq=map.get(num);
            if(freq>maxfreq){
                maxfreq=freq;
                res=num;
            }
            else if(freq==maxfreq){
                res=Math.min(res,num);
            }
            }
        }
        return (res!=Integer.MAX_VALUE)?res:-1;
    }
}