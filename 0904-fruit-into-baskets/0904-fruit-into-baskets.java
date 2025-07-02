class Solution {
    public int totalFruit(int[] arr) {
        int left=0;
        int maxlen=0;
        Map<Integer,Integer>fmap=new HashMap<>();
        for(int right=0;right<arr.length;right++){
            fmap.put(arr[right],fmap.getOrDefault(arr[right],0)+1);
            while(fmap.size()>2){
                fmap.put(arr[left],fmap.get(arr[left])-1);
                if(fmap.get(arr[left])==0)fmap.remove(arr[left]);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;

    }
}